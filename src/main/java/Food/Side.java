package Food;

public record Side(String type, String size) {
    public double getChipsPrice() {
        if (type.equals("Chips")) {
            return 1.50;
        }
        return 0;
    }

    public double getDrinkPrice() {
        return switch (size.toLowerCase()) {
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 0;
        };
    }


}
