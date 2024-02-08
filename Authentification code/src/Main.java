import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Welcome again " + name);
        while (true){
            try {
                System.out.println("Enter your password");
                String pass = scanner.nextLine();

                int password = Integer.parseInt(pass);

                if(!(password == 1234)){
                    System.out.println("Wrong password, Please try again");
                }else {
                    System.out.println("Password accepted");
                    break;
                }

            } catch (NumberFormatException e){
                System.out.println("Invalid format");
                break;
            }

        }


    }
}