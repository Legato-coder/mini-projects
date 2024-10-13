package mini.RestAPIInterOperableEx;

public class Book {
    private int bookID;
    private String bookName;
    private double bookPrice;

    // Constructor
    public Book(int bookID, String bookName, double bookPrice) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
    }

    // Getters
    public int getBookID() {
        return bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    // Setters
    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
