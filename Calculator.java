import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() throws IllegalArgumentException {
        switch (operation) {
            case "addition":
                return a + b;
            case "subtraction":
                return a - b;
            case "multiplication":
                return a * b;
            case "division":
                if (b == 0) {
                    throw new IllegalArgumentException("Division by zero is not allowed");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operation. Use 'addition', 'subtraction', 'multiplication', or 'division'");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter operation (addition, subtraction, multiplication, division): ");
        scanner.nextLine();
        String operation = scanner.nextLine();

        try {
            Calculator calc = new Calculator(a, b, operation);
            double result = calc.calculate();
            System.out.printf("Result: %.2f%n", result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}