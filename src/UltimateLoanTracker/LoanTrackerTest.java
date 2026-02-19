package UltimateLoanTracker;

import java.util.Scanner;

public class LoanTrackerTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] Product = new Product [4];

        Product[0] = new Book ("java for beginners", 7, 1.5, "John Doe");
        Product[1] = new Electronics("Raspberry Pi 48", 3, 40, "4B","", 500);
        Product[2] = new Electronics("Arduino Beginner Kit", 2, 20, "","Beginner", 400);
        Product[3] = new Video("Intro to Robotics", 5, 3, 120);

        printLoanTracker(loanTracker);

        simulateDays(loanTracker);

        sc.close();
    }

    /*
    public static Product[] createloanTracker(Scanner sc) {

        Product[] loanTracker = new Product[3];

        for (int i = 0; i < loanTracker.length; i++){
            System.out.println("Enter product type (book/electronic/video");
            String type = sc.nextLine();

            System.out.println("Enter product name:");
            String title = sc.nextLine();

            switch (type.toLowerCase()) {
                case "book":
                loanTracker[i] = new Book(title);
                    break;
                case "Electronics":
                loanTracker = new Electronics(title, loanDays, lateFee, model, kitLevel, baseValue);
                    break;
                case "video":
                    loanTracker[i] = new Video(title);
                    break;
                default:
                    System.out.println("Unknown type");
            }
        }

        return loanTracker;
        */


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
