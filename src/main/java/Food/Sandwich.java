package Food;

import java.util.ArrayList;

public class Sandwich {
    private int size;
    private String breadType;
    private boolean isToasted;
    private ArrayList<Topping> toppings;

    public Sandwich(int size, String breadType, boolean isToasted, ArrayList<Topping> toppings) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;
        this.toppings = toppings;
    }

    public int getSize() {
        return size;
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
    if (size == 4)
        return 5.50;
    if (size == 8)
        return 7.00;
    if (size == 12)
        return 8.50;
    return 0;
    }

}
