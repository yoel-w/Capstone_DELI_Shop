package Food;

public class FreeTopping extends Topping{
    public FreeTopping(String name){
        super(name, false);
    }

    @Override
    public double getPrice(int sandwichSize) {
        return 0.00;
    }
}
