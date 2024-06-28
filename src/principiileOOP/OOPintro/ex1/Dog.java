package sesiunea10.OOPintro.ex1;

public class Dog {

    String name;
    String color;
    String breed;

    public Dog(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public void bark(){
        System.out.println("woof" + this.name);
    }

    public void run(){
        System.out.println("run" + this.name);
    }
}
