
package sesiunea11.ex8;
import sesiunea11.ex8.Backpack;
import sesiunea11.ex8.Book;

public class Main {

    //Imagineaza-ti ca esti un student cu un ghiozdan.
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
    public static void main(String[] args) {

        Backpack backpack = new Backpack(10);
        Book book1 = new Book("abc", 60, 1);
        Book book2 = new Book("cde", 150, 2);
        System.out.println(backpack.addBook(book1));
        System.out.println(backpack.addBook(book2));

        String[] titles = backpack.getBookTitles();

        for (int i = 0; i < titles.length; i++) {
            System.out.println(titles[i]);
        }

        int allPages = backpack.getBooksPages();
            System.out.println("Numarul de pagini totale: " + allPages);
    }
}



