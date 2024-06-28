package exercitii.ex3animalshelter;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);

    }

    @Override
    public void greeting() {
        System.out.println(getName() + "face miau");
    }

    @Override
    public void greeting(Animal anotherAnimal) {
        System.out.println(getName() + " face miau catre " + anotherAnimal.getName());
    }
}
