//https://dzone.com/articles/java-thread-tutorial-creating-threads-and-multithr
package thread1;

public class MyClass implements Runnable {
    public void run(){
        System.out.println("MyClass is running");
    }

    public static void main(String[] args) {
        //Create the object
        MyClass objek1 = new MyClass();
        objek1.run();
    }
}