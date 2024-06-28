package exercitii.ex3animalshelter;

public class Dog extends Animal{



    public Dog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println(getName() + "face woof");
    }

    @Override
    public void greeting(Animal anotherAnimal) {
        System.out.println(getName() + " face woof catre "+ anotherAnimal.getName());
    }
}
