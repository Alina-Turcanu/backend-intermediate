package demo.game;

public class Archer extends PlayerCharacter{


    private int numberOfArrows;

    public Archer(String name, int age, int numberOfArrows) {
        //apelul contructorului din superclasa
        super(name,age);
        this.numberOfArrows = numberOfArrows;
    }

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public void attack(){
        numberOfArrows--;
        System.out.println("number of arrows left "+ numberOfArrows);
    }

    @Override
    public void levelUp() {
        numberOfArrows+=100;
        setAge(getAge() +1);
        setLevel(getLevel() + 1);
    }
}
