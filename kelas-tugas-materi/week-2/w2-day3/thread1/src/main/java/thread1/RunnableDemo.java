//Berhasil - lihat class TestThread
//https://www.tutorialspoint.com/java/java_multithreading.htm

package thread1;

class RunnableDemo implements Runnable {
    //Create attributes
    private Thread t;
    private String threadName;

    //Constructor method
    RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    //Run method
    public void run(){
        System.out.println("Running" + threadName);
        try {
            for(int i=4; i>0;i--){
                System.out.println("Thread: " + threadName + ", " + i);
                //Let the thread sleep for a while
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            //TODO: handle exception
            System.out.println("Thread " + threadName + " interupted.");
        }
        System.out.println("Thread " + threadName + " existing.");
    }

    //Start Method
    public void Start(){
        System.out.println("Starting " + threadName);
        if(t==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}