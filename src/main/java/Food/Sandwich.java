package Food;

import java.util.ArrayList;

public class Sandwich {
    private int breadSize;
    private String breadType;
    private boolean isToasted;
    private ArrayList<Topping> toppings;

    public Sandwich(int breadSize, String breadType, boolean isToasted) {
        this.breadSize = breadSize;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.toppings = toppings;
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
    private double getBreadPrice()
    {
    if (breadSize == 4)
        return 5.50;
    if (breadSize == 8)
        return 7.00;
    if (breadSize == 12)
        return 8.50;
    return 0;
    }

}
