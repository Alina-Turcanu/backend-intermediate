package exercitii.ex11billieburgers;

import java.util.Arrays;

public class BaseBurger {

    private String breadType;
    private MeatType meat;
    private final double basePrice;

    private Addition[] additions;

    public BaseBurger(String breadType, MeatType meat, Addition[] additions) {
        this.breadType = breadType;
        this.meat = meat;
        if (meat.equals(MeatType.PUI)) {
            this.basePrice = 10;
        }
        else if (meat.equals(MeatType.PORC)){
            this.basePrice = 15;
        } else if(meat.equals(MeatType.VITA)) {
            this.basePrice=20;
        } else {
            System.out.println("tip de carne invalid");
            this.basePrice=0;
        }
        this.additions = additions;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public MeatType getMeat() {
        return meat;
    }

    public void setMeat(MeatType meat) {
        this.meat = meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Addition[] getAdditions() {
        return additions;
    }

    public void setAdditions(Addition[] additions) {
        this.additions = additions;
    }

    @Override
    public String toString() {
        return "BaseBurger{" +
                "breadType='" + breadType + '\'' +
                ", meat='" + meat + '\'' +
                ", basePrice=" + basePrice +
                ", additions=" + Arrays.toString(additions) +
                '}';
    }

    public double getPrice(){
        double totalPrice = basePrice;
        for (int i = 0; i < additions.length; i++) {
            totalPrice += additions[i].getPrice();
        }
        return totalPrice;
    }

    public void cook(){
        System.out.println("cooking a base bruger");
    }


}
