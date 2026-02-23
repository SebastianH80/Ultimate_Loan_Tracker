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
        System.out.println("User is playing with " + this.model);
    }
    //override toString so everything prints
    @Override
    public String toString() {
        return "Electronic \t" + super.toString() +
                "\nModel: \t" + this.model +
                "\nKitlevel\t: " + this.kitLevel +
                "\nBasevalue\t: " + this.baseValue;
    }
}
