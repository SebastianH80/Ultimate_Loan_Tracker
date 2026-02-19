package UltimateLoanTracker;

public class Book extends Product {

    private String author;


    // Constructor

    public Book(String title, int loanDays, double lateFee, String author) {
        super(title, loanDays, lateFee);
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book\t" + super.toString() + "\tAuthor:\t" + author;
    }
}

