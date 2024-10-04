public class Animal {

    public int age;
    public String Gender;

    public void isMammal(){
        System.out.println("This is the public method isMammal() from the Animal class.");
    }

    public void mate(){
        System.out.println("This is the public method mate() from the Animal class");
    }

    public static void main(String[] args) throws Exception {
        
        Animal myAnimal = new Animal();
        Zebra myZebra = new Zebra();
        Fish myFish = new Fish();

        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();
    }

}