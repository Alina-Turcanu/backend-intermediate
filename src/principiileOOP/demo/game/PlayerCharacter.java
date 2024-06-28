package demo.game;

public abstract class PlayerCharacter implements Playable{

    private String name;
    private int age;

    private int level;

    public PlayerCharacter(String name, int age) {
        this.name = name;
        this.age = age;
        this.level = 1;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0) {
            System.out.println("varsta nu poate fi negativa");
        } else{
            this.age = age;
        }
    }

    public void speak(){
        System.out.println("My name is "+ this.name);
    }

    public abstract void attack();



}
