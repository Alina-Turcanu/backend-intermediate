package exercitii.ex3animalshelter;

public class Shelter {

    private Animal[] animals;

    private int numberOfAnimals;
    public Shelter() {

        this.animals = new Animal[100];
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setNumberOfAnimals(int numberOfAnimals) {
        this.numberOfAnimals = numberOfAnimals;
    }

    public boolean addAnimal(Animal animal){
        this.animals[numberOfAnimals] = animal;
        this.numberOfAnimals++;
        return true;
    }

    public void makeHarmalaie (){
        for (int i = 0; i < numberOfAnimals; i++) {
            animals[i].greeting();
        }
    }

}
