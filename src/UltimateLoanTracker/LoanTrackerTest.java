package UltimateLoanTracker;

//import java.util.Arrays; - så vi kan sorter i alfabetisk rækkefølge i output
import java.util.Scanner;

public class LoanTrackerTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("🚀 Welcome to the TechLab Loan System!");
        System.out.println("---------------------------------------");


        Product[] loantracker = createloanTracker(sc); //tilføje counts
        //Product[] Product = new Product [4];

        /*
        Product[0] = new Book ("java for beginners", 7, 1.5, "John Doe");
        Product[1] = new Electronics("Raspberry Pi 48", 3, 40, "4B","", 500);
        Product[2] = new Electronics("Arduino Beginner Kit", 2, 20, "","Beginner", 400);
        Product[3] = new Video("Intro to Robotics", 5, 3, 120);
        */

        /*
        gøre brug til at printe output som i opgaven printLoanTracker(loanTracker);
        */
        sc.close();
    }

    public static Product[] createloanTracker(Scanner sc) {

        int items = 0;
        System.out.println("How many items would you like to borrow ?");
        items = sc.nextInt();

        Product[] loanTracker = new Product[items];


        for (int i = 0; i < loanTracker.length; i++){
            System.out.println("Enter product type (book/electronic/video): ");
            String type = sc.nextLine();
            sc.nextLine();

            System.out.println("Enter product name: ");
            String title = sc.nextLine();

            System.out.println("Enter Loan days: ");
            int loanDays = sc.nextInt();
            sc.nextLine();

            System.out.println("Late Fee is: ");
            double lateFee = 0.0;
            if (sc.hasNextDouble()) {
                lateFee = sc.nextDouble();
                sc.nextLine();
            }

            //product specific attributer
            if (type.equalsIgnoreCase("book")) {
                System.out.println("Author: ");
                String author = sc.nextLine();

                loanTracker[i] = new Book(title, loanDays, lateFee, author);
            } else if (type.equalsIgnoreCase("electronics")) {

                System.out.println("Model: ");
                String model = sc.nextLine();

                System.out.println("Kitlevel: ");
                String kitLevel = sc.nextLine();

                System.out.println("Basevalue: ");
                int baseValue = sc.nextInt();

                loanTracker[i] = new Electronics(title, loanDays, lateFee, model, kitLevel, baseValue);
                sc.nextLine();

            } else if (type.equalsIgnoreCase("video")) {

                System.out.println("video duration (minutes): ");
                int duration = sc.nextInt();

                loanTracker[i] = new Video(title, loanDays, lateFee, duration);
                sc.nextLine();
            } else {
                    System.out.println("Unknown type");
            }
        }

        return loanTracker;

    }

    public static void printProduct(Product[] loanTracker) {
        System.out.println("\n --- all Items ---");

        for (Product product : loanTracker) {
            System.out.println(product);
        }
    }

    public static void simulateDays(Product[] loanTracker) {

        for (int day = 1; day <= 3; day++) {

            System.out.println("\n --- Day " + day + "---");

            for (Product product : loanTracker) {

                product.decreaseLoanDays();

                if (product.LoanDurationExpired()) {
                    System.out.println(product.getTitle() + " Loan Period has ended ");
                } else {
                    System.out.println(product);

                    //Clean Polymorphism
                    product.useProduct();
                }
            }
        }
    }
}
