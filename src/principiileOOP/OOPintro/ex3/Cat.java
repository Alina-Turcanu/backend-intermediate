package sesiunea10.OOPintro.ex3;

public class Cat {

    //3. Creeaza un program care sa numere cate pisici se nasc.
    //Implementeaza o clasa Cat si o metoda getNumberOfCats(),
    // care va returna numarul de pisici create. Clasa Cat va avea atributele:
    //
    //name
    //counter - in care vom retine cate pisici s-au creat
    //Atunci cand o noua pisica se creeaza, counter-ul trebuie sa fie incrementat.

    String name;
    static int counter;

    public Cat(String name) {
        this.name = name;
        counter++;
    }

    public static int getNumberOfCats(){
        return counter;
    }
}
