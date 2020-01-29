package thread1;

public class ExtendsThread extends Thread {
    @Override
    public void run(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        ExtendsThread t1 = new ExtendsThread();
        t1.start();
    }
}