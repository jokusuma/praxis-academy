/**
 * Object With Pure Function
 */
public class ObjectWithPureFunction{
    // Method sum
    public int sum(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        // Create Object
        ObjectWithPureFunction tes = new ObjectWithPureFunction();
        // Running the method
        System.out.println(tes.sum(1,2));
    }
}