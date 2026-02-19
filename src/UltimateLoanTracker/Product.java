package UltimateLoanTracker;

public abstract class Product {
    // Attributer
    private String title;
    private int loanDays;
    private double lateFee;


    // Konstruktør
    public Product(String title, int loanDays, double lateFee) {
        this.title = title;
        this.loanDays = loanDays;
        this.lateFee = lateFee;
    }

    // Getters
    public String getTitle() {
        return title;
    }

}
