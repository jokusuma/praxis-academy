// ini tidak akan jalan kalo atribut & construct di class modifier (file Modifier.java) di set "private"
public class ModifierRun {
    // Run
    public static void main(String[] args) {
        // Create object to access the public
        Modifier newOrang = new Modifier("Jojo", 17);
        // Print
        // System.out.println(newOrang.name + " " + newOrang.age); // kalo pakai ini, tidak perlu create method
        newOrang.printing();
    }
}