package UI;

import Food.Sandwich;
import Food.Side;
import Object.ReceiptReview;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckOutPage {
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<Side> sides;
    private Scanner scanner = new Scanner(System.in);

    public CheckOutPage(ArrayList<Sandwich> sandwiches, ArrayList<Side> sides, Scanner scanner) {
        this.sandwiches = sandwiches;
        this.sides = sides;
        this.scanner = scanner;
    }

    public boolean checkOut() {
        System.out.println("\n========== YOUR ORDER ==========");
        System.out.println(ReceiptReview.finalOrder(sandwiches, sides));
        System.out.println("================================");
        System.out.println("");
        System.out.println("1) Confirm Order");
        System.out.println("2) Cancel and go back");
        System.out.println("");
        System.out.print("Selection: ");
        String confirm = scanner.nextLine();
        if (confirm.equals("1")) {
            ReceiptReview.save(sandwiches, sides);
            System.out.println("");
            System.out.println("Thank you for your order!");
            System.out.println("");
            return true;
        } else {
            System.out.println("");
            System.out.println("Order cancelled. Returning to menu.");
            System.out.println("");
            return false;
        }
    }
}
