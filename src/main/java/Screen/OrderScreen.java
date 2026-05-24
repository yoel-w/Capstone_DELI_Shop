package Screen;

import java.util.Scanner;

public class OrderScreen {
    Scanner scanner = new Scanner(System.in);

    public static void main() {
OrderScreen orderScreen = new OrderScreen();


    }
    public void ordering() {
        String choice;
        System.out.println("What would you like?");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("1) Add Sandwich");
        System.out.println("2) Add Drink");
        System.out.println("3) Add Chips");
        System.out.println("4) Checkout");
        System.out.println("5) Review Order");
        System.out.println("0) Cancel Order");
        System.out.println("");
        System.out.print("Selection: ");
        choice = scanner.nextLine();
        switch (choice) {
            case "1":
                addSandwich();
                break;
                case "2":
                    addDrink();
                    break;
                    case "3":
                        addChips();
                        break;
                        case "4":
                            CheckOutPage.main();
                            break;
                            case "5":
                                ReviewScreen.main();
                                break;
                                case "0":
                                    //pending
                                    break;
                                    default:
                                        System.out.println("Invalid Choice. Please try again.");
        }
    }


    private void addSandwich() {
        String breadType;
        String breadSize;
        System.out.println("What kind of bread would you like?");
        System.out.println("-------------------------");
        System.out.println("");
        System.out.println("1) White");
        System.out.println("2) Wheat");
        System.out.println("3) Rye");
        System.out.println("4) Wrap");
        System.out.println("");
        System.out.print("Selection: ");
        switch(breadType = scanner.nextLine()) {
            case "1":
                breadType = "White";
                break;
                case "2":
                    breadType = "Wheat";
                    break;
                    case "3":
                        breadType = "Rye";
                        break;
                        case "4":
                            breadType = "Wrap";
                            break;
                            default:
                                System.out.println("Invalid Choice. Please try again.");
        }
    }
    private void addDrink() {

    }
    private void addChips() {

    }


}
