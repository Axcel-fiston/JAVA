public class DOg extends Animal{

    private String earShape;
    private String tailShape;
    public DOg(){
        super(" Mutt " ,  "Big" , 50);
    }
public  DOg( String type , double weight){
        this(type , weight , "Perky" , "Curled");
}
    public DOg(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? " small" : (weight < 35 ? "medium " : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "DOg{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise(){
        if(type == "wolf"){
            System.out.println(" ow Woooo");
        }
bark();
System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
//        System.out.println("Dogs walk , run and wag their tail");
        if (speed == "slow") {

            walk();
            wagTail();
        }else {
            run();
            bark();
        }
        System.out.println();
    }

    private void bark(){
        System.out.println("Woof ! ");
    }
    private void run(){
        System.out.println("Dog Running ! ");
    }
    private void walk(){
        System.out.println("Dog Walking ! ");
    }
    private void wagTail(){
        System.out.println("Tail Wagging ! ");
    }

}
