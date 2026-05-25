package Screen;

import Food.PrmTopping;
import Food.Sandwich;

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
        int breadSize = 0;
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

        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("What size would you like?");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("1) 4 in");
        System.out.println("2) 8 in");
        System.out.println("3) 12 in");
        System.out.println("");
        System.out.print("Selection: ");
        switch(breadType = scanner.nextLine()) {
            case "1":
                breadSize = Integer.parseInt("4");
                break;
                case "2":
                    breadSize = Integer.parseInt("8");
                    break;
                    case "3":
                        breadSize = Integer.parseInt("12");
                        break;
                        default:
                            System.out.println("Invalid Choice. Please try again.");
        }
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("Would you like your sandwich toasted?");
        System.out.println("---------------------------------------");
        System.out.println("");
        System.out.println("Would you like your sandwich toasted? Y/N ");
        System.out.println("");
        System.out.print("Selection: ");
        boolean isToasted = scanner.nextLine().equalsIgnoreCase("y");

        Sandwich sandwich = new Sandwich(breadSize, breadType, isToasted);

        addMeat(sandwich);
        addCheese(sandwich);
        addRegToppings(sandwich);
        addSauces(sandwich);
        }

        private void addMeat(Sandwich sandwich) {
            String choice3;
            String[] meat = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Bacon", "Falafel"};
            System.out.println("What meat would you like?");
            for (int i = 0; i < meat.length; i++) {
                System.out.println((i + 1) + ") " + meat[i]);
            }
            System.out.println("");
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.print("Selection: ");
            choice3 = scanner.nextLine();
            int i = Integer.parseInt(choice3);
            if (i >= 0 && i < meat.length)
            {
            sandwich.addTopping(new PrmTopping(meat[i], "meat", false));
            System.out.println("Extra Meat? Y/N");
            System.out.println("");
            System.out.print("Selection: ");
                if (scanner.nextLine().equalsIgnoreCase("y")) {
                    sandwich.addTopping(new PrmTopping(meat[i], "meat", true));
                }
            }
        }

        private void addCheese(Sandwich sandwich) {
        String choice4;
        String[] cheese = {"American", "Provolone", "Cheddar", "Swiss", "Cashew Cheese", "None"};
            System.out.println("What cheese would you like?");
            for (int i = 0; i < cheese.length; i++) {
                System.out.println((i + 1) + ") " + cheese[i]);
            }
            System.out.println("");
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.print("Selection: ");
            choice4 = scanner.nextLine();
            int i = Integer.parseInt(choice4);
            if (i >= 0 && i < cheese.length)
            {
                sandwich.addTopping(new PrmTopping(cheese[i], "cheese", false));
                System.out.println("Extra Meat? Y/N");
                System.out.println("");
                System.out.print("Selection: ");
                if (scanner.nextLine().equalsIgnoreCase("y")) {
                    sandwich.addTopping(new PrmTopping(cheese[i], "cheese", true));
                }
            }

    }
    private void addRegToppings(Sandwich sandwich) {

    }
    private void addSauces(Sandwich sandwich) {
        String[] sauce = {"Mayo","Mustard", "Honey Mustard", "Ketchup", "Ranch", "Thousand Islands"
                ,"Vinaigrette", "Hummus", "Tahini", "None"};
    }

    private void addDrink() {
        String drinkSize;
        System.out.println("What drink size would you like?");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("1) Small - $2.00");
        System.out.println("2) Medium - $2.50");
        System.out.println("3) Large - $3.00");
        System.out.println("4) Cancel");
        System.out.println("");
        System.out.print("Selection: ");
        switch(scanner.nextLine()) {
            case "1":
                drinkSize = "small";
                break;
                case "2":
                    drinkSize = "medium";
                    break;
                    case "3":
                    drinkSize = "large";
                    break;
                    case "4":
                        return;
                        default:
                        System.out.println("Invalid Choice. Please try again.");
        }
        System.out.println("");
        System.out.print("Drink have been added!");
        return;

    }
    private void addChips() {

        System.out.println("Would you like some chips for $1.50?");
        System.out.println("--------------------------------------");
        System.out.println("");
        return;

    }


}
