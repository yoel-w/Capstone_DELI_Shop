package UI;

import Food.Sandwich;
import Food.Side;

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

    public static void checkOut() {


    }
}
