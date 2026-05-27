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

        for (int i = 0; i < sandwiches.size(); i++) {
            Sandwich sandwich = sandwiches.get(i);
            String toast = sandwich.isToasted() ? " (toasted)" : "";
            order.append(toast);
            order.append(sandwich.getBreadSize() + "\" " + sandwich.getBreadType());
            order.append("Base price: $" + String.format("%.2f", sandwich.getBreadSize()));

            for (Topping topping : sandwich.getToppings()) {
                double toppingPrice = topping.getPrice(sandwich.getBreadSize());
                order.append(String.format("%.2f", toppingPrice));
            }
            double sandwichTotal = sandwich.getTotalPrice();
            order.append(  String.format("%.2f", sandwichTotal));

        }
        if (!sides.isEmpty()) {
            order.append("Drinks & Chips: ");
            for (Side side : sides) {
                String liquid = side.type();
                String label = liquid.equals("drink")
                        ? side.size() + " " + side.name()
                        : side.name() + " (chips)";
                double price = liquid.equals("drink") ? side.getDrinkPrice() : side.getChipsPrice();
                order.append(label +  String.format("%.2f", price));
            }
        }
        return order.toString();
    }

    public static void save(ArrayList<Sandwich> sandwiches, ArrayList<Side> sides){
        try  {
                Files.createDirectories(Paths.get("src/main/java/Receipts"));
                LocalDateTime dateTime = LocalDateTime.now();
                String FileName = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(dateTime);

        } catch (RuntimeException | IOException e) {
            throw new RuntimeException(e);
        }
    }










}
