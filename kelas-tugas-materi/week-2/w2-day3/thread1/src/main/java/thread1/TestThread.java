//Berhasil - lihat class RunnableDemo
//https://www.tutorialspoint.com/java/java_multithreading.htm
package thread1;

public class TestThread {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("Thread-1");
        r1.Start();

        RunnableDemo r2 = new RunnableDemo("Thread-2");
        r2.Start();
    }
}