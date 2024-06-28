package demo.game;

public class Wizard extends PlayerCharacter {

    private int power;

    public Wizard(String name, int age, int power){
        super(name, age);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void attack(){
        System.out.println("atacking with power: " + power);
    }

    @Override
    public void levelUp() {
        power += 50;
        setLevel(getLevel()+1);
    }


}
