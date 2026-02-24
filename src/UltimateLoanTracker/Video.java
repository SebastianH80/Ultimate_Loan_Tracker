package UltimateLoanTracker;

class Video extends Product {

    private double duration;


    public Video (String title, int loanDays, double lateFee, double duration){
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
        return "Video \t" + super.toString() +
                "\n duration (minutes): \t" + this.duration;

    }
}
