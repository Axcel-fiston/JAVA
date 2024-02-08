public class Main {
    public static void main(String[] args) {
        String[] sza ={
                "Smurk Carter By lil Durk",
                "You know, money and power",
                "got the trenches united" ,
                "Got some members indicted",
                "over money and violence",
                "I was raised in the jungle with snakes, ",
                        "rats, and some lions (yeah)" ,
                "Left the Pellys for winters",
                "dope boys and giants" ,
        "Daddy took over the streets",
                "Larry Hoover was my age",
        "When weed was so cheap",
                "selling' drugs off MySpace",
        "I'm a gangster at heart",
                "could stop a war with my face",
        "Mama, I said I'm sorry for putting",
                "you through the mind games, sorry",
       "Only The Family the Navy (yeah)"
        };
                for (String line : sza){
                    System.out.println(line);
                    try{
                        Thread.sleep(1550);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
    }
}