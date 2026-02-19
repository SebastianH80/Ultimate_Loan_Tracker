package UltimateLoanTracker;

public abstract class Product {
    // Attributers
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

    public int getLoanDays() {
        return loanDays;
    }

    public double getLateFee() {
        return lateFee;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setLoanDays(int loanDays) {
        this.loanDays = loanDays;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    //Logisk Metode

    public void decreaseLoanDays() {
        loanDays--;
    }

    public boolean LoanDurationExpired() {
        return loanDays <= 0;
    }

    //Polymorhic method (Vigtigt)
    public abstract void useProduct();

    @Override
    public String toString() {
        return "Product: " + title + " | Loan days left: " + loanDays + " | Late fee per late day: " + lateFee;
    }
}
