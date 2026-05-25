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
    public double getPrice() {
        if(pt.equals("meat")){
            if(isExtra){



            }
        }
    }


}
