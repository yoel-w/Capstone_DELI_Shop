package Object;

import Food.Sandwich;
import Food.Side;
import Food.Topping;

import java.util.ArrayList;

public class ReceiptReview {

    public static String finalOrder(ArrayList<Sandwich> sandwiches, ArrayList<Side> sides){
        StringBuilder order = new StringBuilder();

        for (int i = 0; i < sandwiches.size(); i++) {
            Sandwich sandwich = sandwiches.get(i);
            String toast = sandwich.isToasted() ? " (toasted)" : "";
            order.append(toast);
            order.append(sandwich.getBreadSize() + "\" " + sandwich.getBreadType());
//            order.append("Base price: $" + String.format("%.2f", getPrice(sandwich.getBreadSize())));
            for (Topping topping : sandwich.getToppings()) {
                double toppingPrice = Topping.getPrice(sandwich.getBreadSize());
            }
        }
    }










}
