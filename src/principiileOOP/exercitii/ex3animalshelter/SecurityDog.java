package exercitii.ex3animalshelter;

public class SecurityDog extends Dog{


    public SecurityDog(String name) {
        super(name);
    }
    @Override
    public void greeting() {
        System.out.println(getName() + "face woooooooooof");
    }

    @Override
    public void greeting(Animal anotherAnimal) {
        System.out.println(getName() + " face wooooooooof catre "+ anotherAnimal.getName());
    }
}
