package sesiunea11.ex8;

public class Book {
//    Imagineaza-ti ca esti un student cu un ghiozdan.
//Ghiozdanul are o anumita capacitate si tu trebuie sa pui niste carti in el. Fiecare carte are titlu, numar de pagini si greutate.
// Poti sa pui carti in ghiozdan pana la o anumita greutate maxima (daca la nu moment dat o carte depaseste greutate maxima, nu poti sa o mai pui in ghiozdan) Clasa Book va avea atributele:
//
//title
//numberOfPages
//Weight
//Clasa Backpack va avea atributele:
//
//maxWeight
//currentWeight
//bookList (un array de maxim 30 de carti)
//numberOfBooks (numarul curent de carti din bookList)
//Clasa Backpack va avea urmatoarele functionalitati:
//
//getTotalPages() - va returna numarul total de pagini ale tuturor cartilor din ghiozdan
//getCurrentBooks() - va returna lista de carti care sunt in ghiozdan
//addBook() - va adauga o carte in ghiozdan, daca adaugarea ei nu depaseste greutatea maxima
//Intr-o clasa main, instantiaza obiectele de care ai nevoie, pentru a testa functionalitatile.


    String title;
    int numberOfPages;
    int weight;

    public Book(String title, int numberOfPages, int weight) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.weight = weight;
    }

}
