package UltimateLoanTracker;

class Video extends Product {

    private int duration;


    public Video (String title, int loanDays, double lateFee, int duration){
        super(title, loanDays, lateFee);
        this.duration = duration;
    }
    //Polymorph metode
    @Override
    public void useProduct() {
        //do something();
    }

    @Override
    public String toString() {
        return "Type: Video " + super.toString() +
                "duration (minutes): " + this.duration + " min";

    }
}
