package UltimateLoanTracker;

public class Electronics extends Product{
    private String model;
    private String kitLevel;
    private int baseValue;

    //Constructor
    public Electronics(String title, int loanDays, double lateFee, String model,String kitLevel, int baseValue) {
        super(title, loanDays, lateFee);
        this.model = model;
        this.kitLevel = kitLevel;
        this.baseValue = baseValue;
    }


    //Polymorph metode
    @Override
    public void useProduct() {
        System.out.println("Gruppe 7 leger med " + this.model);
    }
    //override toString so everything prints
    @Override
    public String toString() {
        return "Electronic \t" + super.toString() +
                "Model: \t" + this.model +
                "Kitlevel\t: " + this.kitLevel +
                "Basevalue\t: " + this.baseValue;
    }
}
