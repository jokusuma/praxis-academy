public class LatihanThreadRun {
    public static void main(String[] args) {
        //Create object
        LatihanThread t1 = new LatihanThread();
        Thread th1 = new Thread(t1);
        t1.threadName("Thread 1");
        th1.start();

        LatihanThread t2 = new LatihanThread();
        Thread th2 = new Thread(t2);
        t2.threadName("Thread 2");
        th2.start();
    }
}
