package UltimateLoanTracker;

import java.util.Scanner;

public class LoanTrackerTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(system.in);

        Product[] loanTracker = createLoanTracker(sc);

        printLoantracker(loanTracker);

        simulateDays(loanTracker);

        sc.close();
    }

    public static Product[] createloanTracker(Scanner sc) {

        Product[] loanTracker = new Product[3];

        for (int i = 0; i < loanTracker.length; i++){
            System.out.println("Enter product type (book/electronic/video");
            String type = sc.nextLine();

            System.out.println("Enter product name:");
            String name = sc.nextLine();

            System.out.println("Enter Loan days:");
            int days = sc.nextLine();
            sc.nextLine();

            switch (type.equalsIgnoreCase()) {
                case "book";
                loanTracker[i] = new Book (title, loanDays, lateFee,);

                case "Electronics";
                loanTracker = new Electronics (title, loanDays, lateFee, model, kitLevel, baseValue)
            }
        }
    }
}
