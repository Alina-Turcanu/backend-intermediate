package temeColectii.ex16;


import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    // //Librăria va trebui să conțină o colecție de cărți.
    //    // Fiecare carte are atributele: year, title, genre (gen) și author.
    //    //
    //    //Librăria va trebui să implementeze următoarele funcționalități:
    //    //
    //    //Afișarea cărților ordonate după year
    //    //Afișarea cărților ordonate după autor
    //    //Gruparea cărților după genre
    //    //Afișarea tuturor cărților dintr-un anumit gen
    //    //Afișarea tuturor genurilor împreună cu toate cărțile din fiecare gen
    //    //Afișarea tuturor genurilor
    //    //Adăugarea unei cărți
    //    //Ștergerea unei cărți
    public List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
        public void sortBooksByYear() {
            Collections.sort(books, new YearComparator());
        }

    }

