package Food;

public class Side {
    private String name;
    private String type;
    private String size;

    public Side(String name, String type, String size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }
    public double getChipsPrice() {
        if (type.equals("Chips")) {
            return 1.50;
        }
        return 0;
    }
    public double getDrinkPrice() {
        switch (size.toLowerCase()) {
            case "Small":
                return 2.00;
            case "Medium":
                return 2.50;
            case "Large":
                return 3.00;
            default:
                return 0;

        }
    }
    public double getSides() {
        if (type.equals("Sides")) {
            return 0;
        }
        return 0;
    }


}
