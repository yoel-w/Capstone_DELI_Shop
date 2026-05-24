package Food;

public class Topping {

private String name;
private String toppingType;
private boolean isExtra;

    public Topping(String name, String toppingType, boolean isExtra) {
        this.name = name;
        this.toppingType = toppingType;
        this.isExtra = isExtra;
    }

    public String getName() {
        return name;
    }

    public String getToppingType() {
        return toppingType;
    }

    public boolean isExtra() {
        return isExtra;
    }


}

