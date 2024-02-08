import java.util.Scanner;

public class ParsingValues {
    public static void main(String[] args) {
       int count= 1;
       int sum=0;

       while (count<=5){
           try {
               Scanner scanner = new Scanner(System.in);
               System.out.println(" Enter the number # " + count + ".");
               String NextNumber= scanner.nextLine();
               int number = Integer.parseInt(NextNumber);
               sum+=number;

               count++;
           }catch (NumberFormatException e){
               System.out.println("Invalid format");
           }

       }
        System.out.println("the sum is " + sum);
    }

}
