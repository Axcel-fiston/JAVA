import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number:");
            int number1 = getInput(scanner);

            System.out.println("Enter the second number:");
            int number2 = getInput(scanner);

            System.out.println("Enter the Operator: +, -, *, /");
            String operator = scanner.nextLine();

            int result = 0;
            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "/":
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue; // Restart the loop to ask for valid input
                    }
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                default:
                    System.out.println("Invalid operator!");
                    continue; // Restart the loop to ask for valid input
            }

            System.out.println("Result: " + result);
            System.out.println("Do you want to perform another calculation? (1/2)");

            while (true){
                String choice = scanner.nextLine();
                try {
                    int choice1 = Integer.parseInt(choice);
                    if (!(choice1 == 1)) {
                        break;
                    }
                }catch (NumberFormatException e){
                    System.out.println("Invalid , Please try again");
                }

            }
            break;

        }

        scanner.close();
    }

    public static int getInput(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
    }
}
