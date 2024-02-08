import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int LoopCount=0;
        double max=0;
        double min=0;
       while (true){
           Scanner scanner = new Scanner(System.in);
           System.out.println(" Enter the number");

           String NextNumber= scanner.nextLine();
           try {
               int number = Integer.parseInt(NextNumber);
               if((LoopCount == 0 )|| (number>max)){
                   max=number;
               }
               if ((LoopCount == 0)||(number<min)){
                   min=number;
               }
               LoopCount++;
           }
           catch (NumberFormatException E){
               break;
           }

       }
        if(LoopCount>0) {
            System.out.println(" The man and min of the numbers providers are " + max+ " and "+ min);
        }
        else {
            System.out.println("Invalid data entered");
        }

    }
}