package Calculate;

public class Calculator {
    // addition method
    public void addition(int a, int b) {
        System.out.println("Addition Result: " + (a + b));
    }

    // subtraction method
    public void subtraction(int a, int b) {
        System.out.println("subtraction Result: " + (a - b));
    }

    // division method
    public void division(int a, int b) {
        // check if b is not zero to avoid division by zero
        if (b != 0) {
            System.out.println("Division Result : " + ((double) a / b));
        } else {
            System.out.println("cannot divide by zero");
        }
    }

    // multiplication method
    public void multiplication(int a, int b) {
        System.out.println("Multiplication Result: " + (a * b));
    }

    // calculate result based on symbol
    public void calculateResult(int a, int b, char symbol) {
        switch (symbol) {
            case '+':
                addition(a, b);
                break;
            case '-':
                subtraction(a, b);
                break;
            case '*':
                multiplication(a, b);
                break;
            case '/':
                division(a, b);
                break;
            default:
                System.out.println("Invalid symbol. Please use +,-,*,or /");
        }
    }
}

