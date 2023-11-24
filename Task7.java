import java.util.Scanner;

class Calculator {

    public static double Plus(double a, double b) {
        return a + b;
    }

    public static double Minus(double a, double b) {
        return a - b;
    }

    public static double Multiply(double a, double b) {
        return a * b;
    }

    public static double Divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}

public class Task7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number ");
        double a = sc.nextDouble();

        System.out.print("Enter the operation (+, -, *, /): ");
        char operation = sc.next().charAt(0);

        System.out.print("Enter the second number ");
        double b = sc.nextDouble();

        double result;

        try {
            switch (operation) {
                case '+':
                    result = Calculator.Plus(a, b);
                    break;
                case '-':
                    result = Calculator.Minus(a, b);
                    break;
                case '*':
                    result = Calculator.Multiply(a, b);
                    break;
                case '/':
                    result = Calculator.Divide(a, b);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator.");
            }

            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
