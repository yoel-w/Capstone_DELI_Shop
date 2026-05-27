package Food;

public record Side(String name, String type, String size) {
    public double getChipsPrice() {
        if (type.equals("Chips")) {
            return 1.50;
        }
        return 0;
    }

    public double getDrinkPrice() {
        return switch (size.toLowerCase()) {
            case "Small" -> 2.00;
            case "Medium" -> 2.50;
            case "Large" -> 3.00;
            default -> 0;
        };
    }


}
