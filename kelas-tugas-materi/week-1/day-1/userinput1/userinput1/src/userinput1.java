import java.util.Scanner; 

public class userinput1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a number: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        //System.out.println(n);
        for (int i=0; i<n; i++){
            System.out.println("love");
        }
    }
}
