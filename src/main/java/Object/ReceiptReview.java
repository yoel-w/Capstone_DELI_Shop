package Object;

import Food.Sandwich;
import Food.Side;
import Food.Topping;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReceiptReview {

    public static String finalOrder(ArrayList<Sandwich> sandwiches, ArrayList<Side> sides){
        StringBuilder order = new StringBuilder();
        LocalDateTime now = LocalDateTime.now();
        String timestamp = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(now);

        order.append("==============================\n");
        order.append("       Spice Deli Sandwiches  \n");
        order.append("==============================\n");
        order.append("Date: ").append(timestamp).append("\n");
        order.append("------------------------------\n");

        double orderTotal = 0;

        for (int i = 0; i < sandwiches.size(); i++) {
            Sandwich sandwich = sandwiches.get(i);
            String toast = sandwich.isToasted() ? " (toasted)" : "";
            order.append("Sandwich #").append(i + 1).append(": ")
                    .append(sandwich.getBreadSize()).append("\" ")
                    .append(sandwich.getBreadType()).append(toast).append("\n");
            order.append("  Base price: $").append(String.format("%.2f", sandwich.getBasePrice())).append("\n");

            for (Topping topping : sandwich.getToppings()) {
                double toppingPrice = topping.getPrice(sandwich.getBreadSize());
                order.append("  + ").append(topping.getName()).append(": $")
                        .append(String.format("%.2f", toppingPrice)).append("\n");
            }
            double sandwichTotal = sandwich.getTotalPrice();
            order.append("  Sandwich Total: $").append(String.format("%.2f", sandwichTotal)).append("\n");
            orderTotal += sandwichTotal;
        }

        if (!sides.isEmpty()) {
            order.append("------------------------------\n");
            order.append("Drinks & Chips:\n");
            for (Side side : sides) {
                String liquid = side.type();
                String label = liquid.equals("Drink")
                        ? side.size() + " " + side.type()
                        : side.type() + " (chips)";
                double price = liquid.equals("Drink") ? side.getDrinkPrice() : side.getChipsPrice();
                order.append("  ").append(label).append(": $").append(String.format("%.2f", price)).append("\n");
                orderTotal += price;
            }
        }

        order.append("==============================\n");
        order.append("ORDER TOTAL: $").append(String.format("%.2f", orderTotal)).append("\n");
        order.append("==============================\n");

        return order.toString();
    }

    public static void save(ArrayList<Sandwich> sandwiches, ArrayList<Side> sides){
        try {
            Files.createDirectories(Paths.get("receipts"));
            LocalDateTime dateTime = LocalDateTime.now();
            String fileName = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss").format(dateTime);
            String filePath = "receipts/" + fileName + ".txt";
            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(finalOrder(sandwiches, sides));
            }
        } catch (RuntimeException | IOException e) {
            throw new RuntimeException(e);
        }
    }










}
