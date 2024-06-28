package exercitii.ex3animalshelter;

public abstract class Animal {

    //3. Creează o aplicatie care să simuleze un adăpost de animale
    //Clasa Animal
    //Atribute:
    //
    //name
    //age
    //Metode:
    //
    //Metoda abstractă makeSound()
    //Clasa Cat (extinde Animal)
    //Atribute: niciun atribut nou
    //
    //Metoda makeSound():
    //
    //Va afișa un mesaj ca de exemplu: “Pisica Tom face miau”
    //Clasa Dog (extinde Animal)
    //Atribute: niciun atribut nou
    //
    //Metoda makeSound():
    //
    //Va afișa un mesaj ca de exemplu: “Câinele Azor latră”
    //Clasa SecurityDog (extinde Dog)
    //Atribute: niciun atribut nou
    //
    //Metoda makeSound():
    //
    //Va afișa un mesaj ca de exemplu: “Câinele Azor latră agresiv”
    //Clasa Shelter
    //Atribute:
    //
    //animals (adică o listă de animale)
    //Metode:
    //
    //makeNoise():
    //
    //Această metodă va face ca toate animalele din listă să scoată sunet
    //addAnimal():
    //
    //Această metodă va adăuga un animal în lista de animale
    //main():
    //
    //În această metodă se vor adăuga animale în lista folosind metoda addAnimal()
    //Apoi se va apela metoda makeNoise() pentru ca fiecare animal din listă să facă sunetul corespunzător (de câine sau de pisică, după caz)


    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void greeting();

    public abstract void greeting(Animal anotherAnimal);
}
