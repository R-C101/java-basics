import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, result;
        char operator;
        String choice;

        do {
            System.out.print("Enter the first number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            num2 = scanner.nextInt();

            System.out.print("Enter the operation (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    break;
            }

            System.out.print("Do you want to perform another calculation? (Y/N): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("Y"));
        
        scanner.close();
    }
}

