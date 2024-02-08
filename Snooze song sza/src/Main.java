public class Main {
    public static void main(String[] args) {

        String[] sza = {"I can't lose when I'm with you",
                "How can I snooze and miss the moment?" ,
                "You just too important" ,
                "Nobody do body like you do" ,
                "I can't lose when I'm with you" ,
                "I can't just snooze and miss the moment" ,
                "You just too important" ,
                "Nobody do body like you do, you do"
        };
        for( String line : sza){
            System.out.println(line);

            try{
                Thread.sleep(2500);
            }catch (InterruptedException e ) {
                e.printStackTrace();
            }

        }

    }
}