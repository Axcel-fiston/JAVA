import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        int number=0;
        int sum=0;
        long average=0;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number");
            String NextNumber = scanner.nextLine();
            try {
                 number = Integer.parseInt(NextNumber);
                sum+=number;
                number++;
            }catch (NumberFormatException e){
                break;
            }
        }
        average= Math.round((double)sum/number);
System.out.println("SUM = " + sum + " AVG " +average );
    }
}