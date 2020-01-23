// Materi Constructor Paramater
// Create class Mobil
public class Mobil {
    // Create Attributes
    String model;
    String warna;
    int year;
    int maxspeed;

    // Create Constructor for class Mobil
    public Mobil(String modelnya, String warnanya, int yearnya, int maxspeednya){
        model = modelnya;
        warna = warnanya;
        year = yearnya;
        maxspeed = maxspeednya;
    }

    // Running the program
    public static void main(String[] args) {
        // Create object
        // Ingat! kalo string, harus dipetik dua
        Mobil mobilBaru = new Mobil("bmw", "hitam", 2020, 280);
        // Print
        System.out.println(mobilBaru.model + " " + mobilBaru.warna + " " + mobilBaru.year + " " + mobilBaru.maxspeed ); 
    }
}