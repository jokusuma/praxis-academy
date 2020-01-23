public class Animal {
    //Create Attribute
    // String animalName;

    //Create Construct
    // public Animal(String ianimalName){
    //     animalName = ianimalName;
    // }
    
    //Create Method
    public void animalSound(){
        System.out.println("Animal makes a sound");
    }
}

class Sapi extends Animal{
    public void animalSound(){
        System.out.println("Sapi say: Woooo");
    }
}