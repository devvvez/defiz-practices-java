import java.util.Scanner;

//my first somewhat-useful-program!
//calculator!
// learning enhanced switches in java.

public class firstcalculator {
    static void main() {
        // CALCULATOR

        double num1;
        double num2;
        char operator;
        double result = 0;
        double zero = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^) ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        scanner.close();
        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.printf("The result is %.2f", result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.printf("The result is %.2f", result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.printf("The result is %.2f", result);
            }
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("You can't divide by zero!");
                } else {
                    result = num1 / num2;
                    System.out.printf("The result is %.2f", result);
                }
            }
            case '^' -> {
                result = Math.pow(num1, num2);
                System.out.printf("The result is %.2f", result);
            }
            default -> System.out.println("Something went wrong.");
        }


    }
}