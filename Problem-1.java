import java.util.Scanner;

class Calculator {
    double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return a + b;
            case "sub":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                if (b == 0) {
                    System.out.println("Division by zero not allowed");
                    return 0;
                }
                return a / b;
            default:
                System.out.println("Invalid operation");
                return 0;
        }
    }
}

public class Problem-1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String operation = sc.next();

        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, operation);

        System.out.println(result);
        sc.close();
    }
}
