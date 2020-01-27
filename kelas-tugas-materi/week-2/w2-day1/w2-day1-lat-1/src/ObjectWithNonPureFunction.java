/**
 * Object With Non Pure Function
 */

public class ObjectWithNonPureFunction {
    //Create attribute and assign the value
    private int value = 1;

    //Create the method
    public int add(int nextValue){
        this.value += nextValue;
        return this.value;
    }
    //Run
    public static void main(String[] args) {
        //Create the object
        ObjectWithNonPureFunction tes = new ObjectWithNonPureFunction();
        //Run the method
        System.out.println(tes.add(4));
    }
}