package colections.exercitii.ex16;


import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(2005,"sdfsdf",Genre.HOWTO,"sfgfdg");
        Book b2 = new Book(2007,"tarlala",Genre.COMEDY,"sfgfddddg");
        Book b3 = new Book(2001,"vgbhb",Genre.HOWTO,"sfdddc");
        Book b4 = new Book(2000,"bb",Genre.NOVEL,"aa");
        Book b5 = new Book(2002,"cc",Genre.COMEDY,"ceb");
        Book b6 = new Book(2001,"dd",Genre.NOVEL,"sssssss");
        List <Book>books=new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        Library library=new Library(books);

        System.out.println("Carti ordonate dupa an:"+library.getBooksOrderedByYear());
        System.out.println("Carti ordonate dupa gen:"+library.getBooksOrderedByAuthor());
        System.out.println("Carti ordonate dupa gen:"+library.getBooksOrderedByGenre());
        System.out.println("Carti gasite cu genul cautat:"+library.findBooksByGenre(Genre.COMEDY));
        System.out.println("Afisarea genurilor impreuna cu toate cartile lor:"+ library.getAllBooksByGenre());
        System.out.println("Genurile cartilor sunt:"+library.getAllGenres());

        Book b10=new Book(2010,"blabla",Genre.COMEDY,"cfra");
        try {
            library.addBook(b10);
            System.out.println("Cartea a fost adaugata cu succes;");
        }catch(Exception e){
            System.out.println("Cartea este deja in lista" +e.getMessage());
        }

        library.deleteBook(b5);
        System.out.println("Cartea selectata a fost stearsa;");
        System.out.println("Cartile actualizate sunt:" +library.getBooks());
    }
}




