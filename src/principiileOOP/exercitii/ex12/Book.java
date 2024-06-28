package exercitii.ex12;

public class Book {
//    Title
//Author
//ISBNCode
//totalNumberOfCopies
//borrowedNumberOfCopies
//Metode
//Doar getteri si setteri

    private String title;
    private String author;
    private int ISBNCOde;
    private int totalNumberOfCOpies;
    private int borrowedNumberOfCOpies;


    public Book(String title, String author, int ISBNCOde, int totalNumberOfCOpies, int borrowedNumberOfCOpies) {
        this.title = title;
        this.author = author;
        this.ISBNCOde = ISBNCOde;
        this.totalNumberOfCOpies = totalNumberOfCOpies;
        this.borrowedNumberOfCOpies = borrowedNumberOfCOpies;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBNCOde() {
        return ISBNCOde;
    }

    public void setISBNCOde(int ISBNCOde) {
        this.ISBNCOde = ISBNCOde;
    }

    public int getTotalNumberOfCOpies() {
        return totalNumberOfCOpies;
    }

    public void setTotalNumberOfCOpies(int totalNumberOfCOpies) {
        this.totalNumberOfCOpies = totalNumberOfCOpies;
    }

    public int getBorrowedNumberOfCOpies() {
        return borrowedNumberOfCOpies;
    }

    public void setBorrowedNumberOfCOpies(int borrowedNumberOfCOpies) {
        this.borrowedNumberOfCOpies = borrowedNumberOfCOpies;
    }
}
