package Food;

import java.util.ArrayList;

public class Sandwich {
    private final int breadSize;
    private final String breadType;
    private final boolean isToasted;
    private ArrayList<Topping> toppings =  new ArrayList<>();

    public Sandwich(int breadSize, String breadType, boolean isToasted) {
        this.breadSize = breadSize;
        this.breadType = breadType;
        this.isToasted = isToasted;
    }

    public int getBreadSize() {
        return breadSize;
    }

    public String getBreadType() {
        return breadType;
    }

    public boolean isToasted() {
        return isToasted;
    }

    public ArrayList<Topping> getToppings() {
        return toppings;
    }
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
    private double getPrice()
    {
    if (breadSize == 4)
        return 5.50;
    if (breadSize == 8)
        return 7.00;
    if (breadSize == 12)
        return 8.50;
    return 0;
    }

    public double getTotalPrice() {
        double total = getPrice();
        for (Topping topping : toppings) {
            total += topping.getPrice(this.breadSize);
        }
        return total;
    }

}
