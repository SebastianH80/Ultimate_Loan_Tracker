package UltimateLoanTracker;

public class Book extends Product {

    private String author;

    private static final int loanDays = 7;
    private static final double lateFee = 1.5;

    // Constructor
    public Book(String title) {
        this(title, "John Doe");
    }

    public Book(String title, String author) {
        super(title, loanDays, lateFee);
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book\t" + super.toString() + "\tAuthor:\t" + author;
    }
}

