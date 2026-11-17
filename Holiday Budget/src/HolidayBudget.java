import java.util.Scanner;

public class HolidayBudget {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Holiday Budget Planner!");

        System.out.print("Enter your holiday budget: $");
        double budget = input.nextDouble();

        double totalSpent = 0;
        int person = 1;
        String answer = "yes";

        // WHILE LOOP
        while (answer.equalsIgnoreCase("yes")) {

            System.out.println("\nShopping for Person " + person);

            System.out.print("How many gifts are you buying? ");
            int numberOfGifts = input.nextInt();

            double personTotal = 0;

            // NESTED LOOPS
            for (int i = 1; i <= numberOfGifts; i++) {

                System.out.println("\nGift " + i);

                for (int j = 1; j <= 1; j++) {

                    System.out.print("Enter the price of this gift: $");
                    double giftPrice = input.nextDouble();

                    personTotal += giftPrice;
                }
            }

            totalSpent += personTotal;

            System.out.println("\nTotal spent on Person " + person + ": $" + personTotal);
            System.out.println("Total holiday spending: $" + totalSpent);

            // IF ELSE STATEMENT
            if (totalSpent > budget) {

                System.out.println("WARNING: You are over your holiday budget!");

            } else if (totalSpent == budget) {

                System.out.println("You have used your entire holiday budget!");

            } else {

                System.out.println("Good job! You are still within your budget.");
                System.out.println("Remaining budget: $" + (budget - totalSpent));
            }

            System.out.print("\nWould you like to shop for another person? (yes/no): ");
            answer = input.next();

            person++;
        }

        System.out.println("\n===== HOLIDAY BUDGET SUMMARY =====");
        System.out.println("Original Budget: $" + budget);
        System.out.println("Total Spent: $" + totalSpent);
        System.out.println("Remaining Balance: $" + (budget - totalSpent));

        if (totalSpent > budget) {
            System.out.println("Final Result: Over Budget");
        } else {
            System.out.println("Final Result: Within Budget");
        }

        System.out.println("\nThank you for using Holiday Budget Planner!");

        input.close();
    }
}