import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        // Create a Scanner so the user can enter numbers
        Scanner input = new Scanner(System.in);

        System.out.println("===== MY CALCULATOR =====\n");

        // Ask the user to enter two numbers
        System.out.print("Enter your first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter your second number: ");
        double number2 = input.nextDouble();

        // Perform and store all four calculations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Use another primitive data type
        boolean calculatorFinished = true;

        // Display the results using tabs and new lines
        System.out.println("\n===== RESULTS =====\n");

        System.out.println("Number 1:\t" + number1);
        System.out.println("Number 2:\t" + number2);

        System.out.println("\nAddition:\t" + addition);
        System.out.println("Subtraction:\t" + subtraction);
        System.out.println("Multiplication:\t" + multiplication);
        System.out.println("Division:\t" + division);

        System.out.println("\nCalculation complete: " + calculatorFinished);
        System.out.println("\n===== END =====");

        input.close();
    }
}