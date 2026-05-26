package Food;

public class PrmTopping extends Topping{

    private String pt;
    public PrmTopping(String name, String pt, boolean isExtra) {
        super(name, isExtra);
        this.pt = pt;


    }
    public String pt() {
        return pt;
    }

    @Override
    public double getPrice(int sandwichSize) {
        if (pt.equals("meat")) {
            if (isExtra) {
                return sandwichSize == 4 ? 0.50 : sandwichSize == 8 ? 1.00 :  1.5;
            }
            return sandwichSize == 4 ? 1.00 : sandwichSize == 8 ? 2.00 : 3.00;
        }
        if (pt.equals("cheese")) {
            if (isExtra) {
                return sandwichSize == 4 ? 0.30 : sandwichSize == 8 ? 0.60 :  0.90;
            }
            return sandwichSize == 4 ? 0.75 : sandwichSize == 8 ? 1.50 : 2.25;
        }
        return 0;
    }


}
