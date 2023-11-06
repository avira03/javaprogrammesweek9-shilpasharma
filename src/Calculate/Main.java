package Calculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        char continueCalculation;
        do {
            // prompt the user for input
            System.out.println("Enter first Number: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter second Number");
            int secondNumber = scanner.nextInt();


            System.out.println("Please enter one of symbol +,-,*,/: ");
            char operationSymbol = scanner.next().charAt(0);

            //call the calculateResult method based on user input
            calculator.calculateResult(firstNumber, secondNumber, operationSymbol);

            //ask the user if they want to do more calculations
            System.out.println("would you like to do more calculation? please enter 'y' or 'N': ");
            continueCalculation = scanner.next().charAt(0);
        } while (continueCalculation == 'Y' || continueCalculation == 'y');

        // close the scanner
        scanner.close();



    }
}

