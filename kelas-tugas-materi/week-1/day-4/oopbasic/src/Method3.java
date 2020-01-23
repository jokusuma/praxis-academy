public class Method3 {
    // Create a public print method 
    public void printMethod(){
        System.out.println("How Are You?");
    }
    public static void main(String[] args) {
        // Karena printMethod public, maka harus create new object untuk mengakses printMethod()
        Method3 newObj = new Method3();
        // Calling the printMethod()
        newObj.printMethod();
    }
}