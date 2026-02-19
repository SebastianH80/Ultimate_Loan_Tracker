package UltimateLoanTracker;

import java.util.Scanner;

public class LoanTrackerTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] electronics = new Product [4];

        //Product[0] = new Book ("java for beginners", 7, "John Doe")
        Product[1] = new Electronics("Raspberry Pi 48", 3, 40, "4B","", 500);
        Product[2] = new Electronics("Arduino Beginner Kit", 2, 20, "","Beginner", 400);

        printLoanTracker(loanTracker);

        simulateDays(loanTracker);

        sc.close();
    }

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
    }
}
