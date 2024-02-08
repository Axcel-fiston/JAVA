import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            while (true) {

                System.out.println("Enter the first number N1");
                int number1 = getInput1(scanner);

                System.out.println("Enter the second number N2");
                 int number2 = getInput2(scanner);

                System.out.println("Enter the Operator : + , - , * , /");
                String operator = null;


                int result = 0;
                try {
                    operator = scanner.nextLine();
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
                                continue;
                            }
                            break;
                        case "*":
                            result = number1 * number2;
                            break;
                        default:
                            System.out.println(operator + " is an invalid operator, please enter +, -, *, /");
                            continue;
                    }

                }catch(NumberFormatException e){
                    System.out.println(operator + "Is an invalid operator , please enter the operator : + , - , * , /");
                }
                System.out.println(result);

                System.out.println("Do you want to perform another calculation? (Y/N)");
                String choice = scanner.nextLine();
                if (!choice.equalsIgnoreCase("Y")) {
                    break;
                };

            }
        scanner.close();
        }
        public static int getInput1(Scanner scanner ){
        while (true){
            String input = null;
            try {
                 input = scanner.nextLine();
                return Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.out.println( input +" is an invalid format , enter the first number N1");
            }
        }

    }
    public static int getInput2(Scanner scanner ){
        while (true){
            String input = null;
            try {
                input = scanner.nextLine();
                return Integer.parseInt(input);
            }catch (NumberFormatException e){
                System.out.println( input +" is an invalid format , Please enter the second number N2");
            }
        }

    }

}