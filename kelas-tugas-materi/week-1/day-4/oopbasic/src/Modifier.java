// JAVA modifier : https://www.w3schools.com/java/java_modifiers.asp
// Create class Modifier
public class Modifier{
    // Create Attributes
    public String name;
    public int age;

    // Create Construct
    public Modifier(String namenya, int agenya){
        name = namenya;
        age = agenya;
    }

    // Create Method
    public void printing(){
        System.out.println(name + " " + age);
    }

    // Run
    public static void main(String[] args) {
        // Create object to access the public
        Modifier newOrang = new Modifier("Jojo", 17);
        // Print
        // System.out.println(newOrang.name + " " + newOrang.age); // kalo pakai ini, tidak perlu create method
        newOrang.printing();
    }
}