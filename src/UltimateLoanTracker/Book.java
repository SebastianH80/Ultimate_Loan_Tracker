package UltimateLoanTracker;

public class Book extends Product {

    private String author;

    // Constructor

    public Book(String title, int loanDays, double lateFee, String author) {
        super(title, loanDays, lateFee);
        this.author = author;
    }

    //Polymorph metode
    @Override
    public void useProduct() {
        //do something();
    }


    @Override
    public String toString() {
        return "Type: Book " + super.toString() + "Author: " + this.author;
    }
}

