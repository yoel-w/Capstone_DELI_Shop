package UI;

import Food.Sandwich;
import Food.Side;
import Object.ReceiptReview;

import java.util.ArrayList;
import java.util.Scanner;

public class ReviewScreen {
    private ArrayList<Sandwich> sandwiches;
    private ArrayList<Side> sides;
    private Scanner scanner;

    public ReviewScreen(ArrayList<Sandwich> sandwiches, ArrayList<Side> sides, Scanner scanner) {
        this.sandwiches = sandwiches;
        this.sides = sides;
        this.scanner = scanner;
    }

    public void show() {
        System.out.println("--- Order Review ---");
        System.out.println(ReceiptReview.finalOrder(sandwiches, sides));
        System.out.println("--------------------\n");
    }
}

