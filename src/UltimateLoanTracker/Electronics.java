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

    /*
    public static void simulateDays(Product[] product) {

        for (int day = 1; day <= 3; day++) {

            System.out.println("\n--- Day " + day + " ---");

            for (Product product : product) {

                product.decreaseLoanDays();

                if (product.isDurationExpiredd(true)) {
                    System.out.println(product.getTitle() + " is overdue! LateFee is:" + lateFee * day + "DKK");
                }
                else {
                    System.out.println(product);

                    // CLEAN POLYMORPHISM
                    product.useProduct();
                }
            }
        }
    }


    }

     */

    //Polymorph metode
    @Override
    public void useProduct() {
        //do something();
        //System.out.println("Total electronics:" + products.electronics.getsize); <-Show total items function?
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
