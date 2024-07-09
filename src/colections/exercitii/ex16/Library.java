package colections.exercitii.ex16;

import java.util.*;

public class Library {

    private List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    //fisarea tuturor genurilor impreuna cu toate cartile din fiecare gen
    public Map<Genre, List<Book>> getAllBooksByGenre() {
        Map<Genre, List<Book>> groupBooksByGenre = new HashMap<>();
        for (Book book : books) {
            if (!groupBooksByGenre.containsKey(book.getGenre())) {
                List<Book> booksValue = new ArrayList<>();
                booksValue.add(book);
                groupBooksByGenre.put(book.getGenre(), booksValue);
            } else {
                groupBooksByGenre.get(book.getGenre()).add(book);
            }
        }
        return groupBooksByGenre;
    }
//gasirea unei carti dupa gen
    public List<Book> findBooksByGenre(Genre genre) {
        List<Book> findBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equals(genre)) {
                findBooks.add(book);
            }
        }
        return findBooks;
    }
//adaugarea unei carti
    public void addBook(Book book) throws Exception {
        if (!books.contains(book)) {
            books.add(book);
        } else {
            throw new Exception("book already exist");
        }
    }
//ordonarea cartilor dupa an
    public List<Book> getBooksOrderedByYear() {
        List<Book> sortedBooks = new ArrayList<>(books);  // Create a copy of the books list
        Collections.sort(sortedBooks);  // Sort the copy
        return sortedBooks;
    }
//ordonarea cartilor dupa autor
    public List<Book> getBooksOrderedByAuthor() {
        List<Book> sortedBooks = new ArrayList<>(books);  // Create a copy of the books list
        Collections.sort(sortedBooks, new AuthorComparator());  // Sort the copy
        return sortedBooks;
    }
//ordonarea cartilor dupa gen
    public List<Book> getBooksOrderedByGenre() {
        List<Book> sortedBooks = new ArrayList<>(books);
        Collections.sort(sortedBooks, new GenreComparator());
        return sortedBooks;
    }


//
//afisarea tuturor genurilor

    public Set<Genre> getAllGenres() {
        Set<Genre> allGenres = new HashSet<>();
        for (Book book : books) {
            allGenres.add(book.getGenre());
        }
        return allGenres;
    }
//stergerea unei carti
    public void deleteBook(Book book) {
        books.remove(book);
    }
}

