public class CalculatorService {

    // The Calculator class (The Blueprint)
    static class Calculator {
        double value1;
        double value2;

        // Constructor to set the two numbers
        Calculator(double num1, double num2) {
            this.value1 = num1;
            this.value2 = num2;
        }

        // Methods to perform all operations
        double add() {
            return value1 + value2;
        }

        double subtract() {
            return value1 - value2;
        }

        double multiply() {
            return value1 * value2;
        }

        double divide() {
            if (value2 == 0) return 0; // Basic safety check
            return value1 / value2;
        }

        double remainder() {
            return value1 % value2;
        }
    }

    // Main method to execute the logic
    public static void main(String[] args) {
        // Create an "instance" of the calculator with two numbers
        Calculator calc = new Calculator(20.0, 5.0);

        System.out.println("Numbers: " + calc.value1 + " and " + calc.value2);
        System.out.println("---------------------------");

        // Calling the methods to get results
        System.out.println("Sum:        " + calc.add());
        System.out.println("Difference: " + calc.subtract());
        System.out.println("Product:    " + calc.multiply());
        System.out.println("Quotient:   " + calc.divide());
        System.out.println("Remainder:  " + calc.remainder());
    }
}
