//Extend MyClasss
package thread1;

public class ExtendsMyClass extends Thread {
    public void run(){
        System.out.println("ExtendsMyClass is running");
    }
    public static void main(String[] args) {
        //Create class
        ExtendsMyClass objek2 = new ExtendsMyClass();
        objek2.run();
    }
}
