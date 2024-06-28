package exercitii.ex12;

public class Library {
    private int[] booklist;
    private int numberOfBooks;

    public Library(int[] booklist, int numberOfBooks) {
        this.booklist = booklist;
        this.numberOfBooks = numberOfBooks;
    }

    public int[] getBooklist() {
        return booklist;
    }

    public void setBooklist(int[] booklist) {
        this.booklist = booklist;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}
