import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operator;
        int n1, n2, r;

        while (true) {
            System.out.println("Simple Calculator");
            System.out.print("Enter first number: ");
            n1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            n2 = scanner.nextInt();

            System.out.print("Choose operation (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    r = n1 + n2;
                    System.out.println("Result: " + n1 + " + " + n2 + " = " + r);
                    break;
                case '-':
                    r = n1 - n2;
                    System.out.println("Result: " + n1 + " - " + n2 + " = " + r);
                    break;
                case '*':
                    r = n1 * n2;
                    System.out.println("Result: " + n1 + " * " + n2 + " = " + r);
                    break;
                case '/':
                    if (n2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        r = n1 / n2;
                        System.out.println("Result: " + n1 + " / " + n2 + " = " + r);
                    }
                    break;
                default:
                    System.out.println("Invalid operation choice.");
            }

            

            System.out.print("Do you want to continue (Y/N)? ");
            char choice = scanner.next().charAt(0);
            if (choice != 'Y' && choice != 'y') {
                break;
            }
        }

        
    }
}
