package UltimateLoanTracker;

//import java.util.Arrays; - så vi kan sorter i alfabetisk rækkefølge i output
import java.util.Scanner;

public class LoanTrackerTest {

    public static void main(String[] args) {

        System.out.println("🚀 Welcome to the TechLab Loan System!");
        System.out.println("---------------------------------------");

        Scanner sc = new Scanner(System.in);
        int count =  askForItems(sc);

        Product[] loanTracker = createloanTracker(sc, count);
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
        sortByTitle(loanTracker);
        printProduct(loanTracker);


        sc.close();
    }

    public static int askForItems(Scanner sc) {

        int count = 0;

        while (true) {
            System.out.print("How many items would you like? ");

            if (sc.hasNextInt()) {
                count = sc.nextInt();
                sc.nextLine();

                if (count > 0) break;
                else System.out.println("Enter a positive number!");
            } else {
                System.out.println("Invalid number!");
                sc.nextLine();
            }
        }

        return count;
    }

    public static Product[] createloanTracker(Scanner sc, int count) {

        Product[] loanTracker = new Product[count];


        for (int i = 0; i < loanTracker.length; i++){
            System.out.println( "\n---------------------------------------------" +
                                "\nListing available items:"+
                                "\nBook (1)" +
                                "\nElectronics (2)" +
                                "\nVideo (1)" +
                                "\n---------------------------------------------" +
                                "\nEnter product type: ");
            String type = sc.nextLine();

            System.out.println("Enter product name: ");
            String title = sc.nextLine();

            System.out.println("Enter Loan days: ");
            int loanDays = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Late Fee: ");
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
                System.out.println(" Unknown type: " + type + ". Please try again.");
                i--;
            }
        }

        return loanTracker;

    }

    public static void printProduct(Product[] loanTracker) {
        System.out.println("\n --- All Items sorted by title ---\n");

        for (Product product : loanTracker) {
            System.out.println(product);
        }
        int i;
        i = loanTracker.length;
        System.out.println("\nYou borrowed " + i + " item(s) today");
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
    public static void sortByTitle(Product[] loanTracker) {

        // Bubble sort using nested loops
        for (int i = 0; i < loanTracker.length - 1; i++) {

            for (int j = 0; j < loanTracker.length - 1; j++) {

                // compareTo compares Strings alphabetically
                // If result > 0 → first name comes AFTER second name
                if (loanTracker[j].getTitle()
                        .compareTo(loanTracker[j + 1].getTitle()) > 0) {

                    // Swap objects
                    Product temp = loanTracker[j];
                    loanTracker[j] = loanTracker[j + 1];
                    loanTracker[j + 1] = temp;
                }
            }
        }
    }
}
