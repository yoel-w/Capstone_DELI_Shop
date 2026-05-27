package UI;

import Food.FreeTopping;
import Food.PrmTopping;
import Food.Sandwich;
import Food.Side;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderScreen {

    private Scanner scanner;
    private ArrayList<Sandwich> sandwiches = new ArrayList<>();
    private ArrayList<Side> sides = new ArrayList<>();

    public static void main(Scanner scanner) {
OrderScreen orderScreen = new OrderScreen(scanner);
orderScreen.ordering();



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
                            CheckOutPage.checkOut();
                            break;
                            case "5":
                                ReviewScreen.main();
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
        addSides(sandwich);
        }

        private void addMeat(Sandwich sandwich) {
            String choice3;
            String[] meat = {"Steak", "Ham", "Salami", "Roast Beef", "Chicken", "Beef Bacon",
                    "Fried Shrimp", "Falafel", "Veggie Patty"};
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
        String[] cheese = {"American", "Provolone", "Cheddar", "Swiss", "Cashew Cheese"};
            System.out.println("What cheese would you like? (Press 0 to skip)");
            for (int i = 0; i < cheese.length; i++) {
                System.out.println((i + 1) + ") " + cheese[i]);
            }
            System.out.println("");
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.print("Selection: ");
            choice4 = scanner.nextLine();
            int i = Integer.parseInt(choice4);
            if (!choice4.equals("0")) {
                int index = Integer.parseInt(choice4) - 1;
                if (i >= 0 && i < cheese.length) {
                    sandwich.addTopping(new PrmTopping(cheese[i], "cheese", false));
                    System.out.println("Extra Meat? Y/N");
                    System.out.println("");
                    System.out.print("Selection: ");
                    if (scanner.nextLine().equalsIgnoreCase("y")) {
                        sandwich.addTopping(new PrmTopping(cheese[i], "cheese", true));
                    }
                }
            }

    }
    private void addRegToppings(Sandwich sandwich) {
        String[] regTopping = {"Lettuce", "Peppers", "Onions", "Tomatoes", "Jalapenos",
                "Cucumbers", "Pickles", "Guacamole", "Mushrooms", "Spinach", "Pepper Relish",
                "Banana Peppers", "olives", };
        boolean top = true;
        while  (top) {
            System.out.println("Which topping would you like? (Press 0 when done)");
            for (int i = 0; i < regTopping.length; i++) {
                System.out.println((i + 1) + ") " + regTopping[i]);
            }
            System.out.println("");
            System.out.print("Selection: ");
            String choicetop = scanner.nextLine();
            if (choicetop.equals("0"))
                {
                top = false;
                }
            else { int index = Integer.parseInt(choicetop) - 1;
                if (index >= 0 && index < regTopping.length) {
                    sandwich.addTopping(new FreeTopping(regTopping[index]));
                    System.out.println(regTopping[index] + " added!");
                }
            }
        }

    }
    private void addSauces(Sandwich sandwich) {
        String[] sauce = {"Mayo","Mustard", "Honey Mustard", "Ketchup", "Ranch", "Thousand Islands"
                ,"Vinaigrette", "Hummus", "Tahini", "Spicy Mayo", "Vegan Mayo", "Vegan Spicy Mayo",
                "None"};
        boolean choiceSauces = true;
        while  (choiceSauces) {
            System.out.println("Which sauce would you like? (Press 0 when done)");
            for (int i = 0; i < sauce.length; i++) {
                System.out.println((i + 1) + ") " + sauce[i]);
            }
            System.out.println("");
            System.out.print("Selection: ");
            String choice10 = scanner.nextLine();
            if (choice10.equals("0"))
            {
                choiceSauces = false;
            }
            else { int index = Integer.parseInt(choice10) - 1;
                if (index >= 0 && index < sauce.length) {
                    sandwich.addTopping(new FreeTopping(sauce[index]));
                    System.out.println(sauce[index] + " added!");
                }
            }
        }
    }

    private void addSides(Sandwich sandwich) {
        String[] sandwichSides = {"au jus", "sauce"};
        boolean side = true;
        while (side) {
            System.out.println("\n--- Sandwich Sides (0 when done) ---");
            for (int i = 0; i < sandwichSides.length; i++) {
                System.out.println((i + 1) + ") " + sandwichSides[i]);
            }
            System.out.print("Selection: ");
            String choice20 = scanner.nextLine();
            if (choice20.equals("0")) {
                side = false;
            } else {
                int index = Integer.parseInt(choice20) - 1;
                if (index >= 0 && index < sandwichSides.length) {
                    sandwich.addTopping(new FreeTopping(sandwichSides[index]));
                    System.out.println(sandwichSides[index] + " added!");
                }
            }
        }
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
        String chips;

        System.out.println("Would you like some chips for $1.50?");
        System.out.println("--------------------------------------");
        System.out.println("");
        System.out.println("1) Yes");
        System.out.println("2) No");
        System.out.println("");
        System.out.print("Selection: ");
       switch(scanner.nextLine()) {
           case "1":
               chips = "yes";
               System.out.println("Chips have been added!");
               break;
               case "2":
                   chips = "no";
                   System.out.println("No chips have been added!");
                   break;
                   default:
                       System.out.println("Invalid Choice. Please try again.");
       }

    }
    private boolean confirmCheckout()
    {
        if (sandwiches.isEmpty() && sides.isEmpty()){
            System.out.println("Your order is empty. Please add an order before able to check out.");
            return false;
        }
        return true;
    }

    public ArrayList<Sandwich> getSandwiches() {
        return sandwiches;
    }
    public ArrayList<Side> getSides() {
        return sides;
    }

    public OrderScreen(Scanner scanner) {
        this.scanner = scanner;
    }


}

