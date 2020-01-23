public class EncapsulationSub {
    public static void main(String[] args) {
        Encapsulation myObj = new Encapsulation();
        //myObj.name = "John";  // error
        myObj.setName("John"); // Set the value of the name variable to "John"
        //System.out.println(myObj.name); // error 
        System.out.println(myObj.getName());
    }
}