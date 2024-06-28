package sesiunea11.ex8;

public class Backpack {
//    Imagineaza-ti ca esti un student cu un ghiozdan.
//Ghiozdanul are o anumita capacitate si tu trebuie sa pui niste carti in el. Fiecare carte are titlu, numar de pagini si greutate.
// Poti sa pui carti in ghiozdan pana la o anumita greutate maxima (daca la nu moment dat o carte depaseste greutate maxima, nu poti sa o mai pui in ghiozdan)
// Clasa Book va avea atributele:

//title
//numberOfPages
//Weight
//Clasa Backpack va avea atributele:

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

    int maxWeight;
    int currentWeight;
    Book[] booklist;
    int numberOfBooks;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
        booklist = new Book[100];
    }

    public boolean addBook(Book book) {
        if (currentWeight + book.weight > maxWeight) {
            return false;
        }
        booklist[numberOfBooks] = book;
        numberOfBooks++;
        return true;
    }


    public String[] getBookTitles() {
        String[] titles = new String[numberOfBooks];
        //merg prin fiacare carte din lista de carti a ghiozdanului
        for (int i = 0; i < numberOfBooks; i++) {
            //extrag titlul cartii curente
            titles[i] = booklist[i].title;
        }
        return titles;

    }

    public int getBooksPages() {
        int allPages = 0;
        for (int i = 0; i < numberOfBooks; i++) {
            allPages += booklist[i].numberOfPages;
        }
        return allPages;
    }
}


