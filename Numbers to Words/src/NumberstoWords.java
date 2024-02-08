import java.util.Scanner;

public class NumberstoWords {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        System.out.println("Enter the number");
        int number= sr.nextInt();
        numberToWords(number);
        reverse(number);
    }
    public static void numberToWords(int number){
        if(number<0){
            System.out.println("Invalid Value");
        }
        int x=number%10;
        int xx= number/10;
        int y=xx%10;
        int yy= number/100;
        while (x == 0){
            switch (x) {
                case 0 -> System.out.println("zero");
                case 1 -> System.out.println("one");
                case 2 -> System.out.println("two");
                case 3 -> System.out.println("three");
                case 4 -> System.out.println("four");
                case 5 -> System.out.println("five");
                case 6 -> System.out.println("six");
                case 7 -> System.out.println("seven");
                case 8 -> System.out.println("eight");
                case 9 -> System.out.println("nine");
            }
        }


    }
    private static void  reverse(int number){
        int rev=0;
        while(number!=0){
            rev= rev*10+ number%10;
            number=number/10;
        }
        System.out.println(rev);
    }
}
