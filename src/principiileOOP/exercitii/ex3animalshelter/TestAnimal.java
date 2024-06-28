package exercitii.ex3animalshelter;

public class TestAnimal {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();


        shelter.addAnimal(new Cat("pisi"));
        shelter.addAnimal(new Dog("azor"));
        shelter.addAnimal(new SecurityDog("pufi"));

        shelter.makeHarmalaie();

        shelter.getAnimals()[1].greeting(shelter.getAnimals()[0]);



    }
}
