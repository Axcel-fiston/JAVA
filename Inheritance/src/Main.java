public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal" , "Huge" , 400);
        doAnimalStuff( animal , "slow");

        DOg dog = new DOg();
        doAnimalStuff( dog , "fast");

        DOg yorkie = new DOg(" Yorkie" , 15);
        doAnimalStuff(yorkie , "fast");
        DOg retriever = new DOg("Labrador retriever" , 65 , "Floppy" , "Swimmer");
        doAnimalStuff(retriever , "slow");

        DOg wolf = new DOg("wolf" , 40);
        doAnimalStuff(wolf , "slow");

        Fish goldie = new Fish("Goldfish" , 0.25 , 2 , 3);
        doAnimalStuff(goldie , "fast");
    }

    public static void doAnimalStuff( Animal animal , String speed){

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println(" _ _ _ _ _ _ _");
    }
}