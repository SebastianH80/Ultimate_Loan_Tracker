package UltimateLoanTracker;

public class Electronics extends Product{
    private String model;
    private String kitLevel;
    private String baseValue;

    //Constructor
    public Electronics(String title, int loanDays, double lateFee, String model,String kitLevel, String baseValue) {
        super(title, loanDays, lateFee);
        this.model = model;
        this.kitLevel = kitLevel;
        this.baseValue = baseValue;
    }

    @Override
    public String toString() {
        return "Electronic \t" + super.toString() +
                "\nModel: \t" + this.model +
                "\nKitlevel\t: " + this.kitLevel +
                "\nBasevalue\t: " + this.baseValue;
    }
}
