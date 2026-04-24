class Calculator {
    // 1. Data (Fields)
    double n1, n2;

    // 2. Setup (Constructor)
    Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    // 3. Actions (Methods)
    void showResults() {
        System.out.println("Sum: " + (n1 + n2));
        System.out.println("Sub: " + (n1 - n2));
        System.out.println("Mul: " + (n1 * n2));
        System.out.println("Div: " + (n2 != 0 ? (n1 / n2) : "Error"));
    }
}

public class Main {
    public static void main(String[] args) {
        // Create the object and run the actions
        Calculator calc = new Calculator(20.0, 5.0);
        calc.showResults();
    }
}
