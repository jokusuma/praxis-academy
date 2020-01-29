public class LatThreadLagiRun {
    public static void main(String[] args) {
        //Create object of the class
        LatThreadLagi thread1 = new LatThreadLagi();
        //Create object of thread 
        Thread th1 = new Thread(thread1);
        //Assign value to namaAngka method
        thread1.namaAngka("TH no 1");
        //Run the thread
        th1.start();

        //Create object of the class
        LatThreadLagi thread2 = new LatThreadLagi();
        //Create object of thread 
        Thread th2 = new Thread(thread2);
        //Assign value to namaAngka method
        thread2.namaAngka("TH no 2");
        //Run the thread
        th2.start();
        
    }
}