//https://www.kurungkurawal.com/2011/04/25/aplikasi-multithread-dengan-java/
//Multithread count 1-10 dan 11-20
//menggunakan cara "Extends"

public class LatihanThread extends Thread {
// public class LatihanThread implements Runnable {
    //Create Attr
    public String name;
    
    //Constructor
    void threadName(String name){
        this.name = name;
    }

    //Method
    @Override
    public void run(){
        for(int i = 1; i<=10; i++){
            System.out.println(this.name + " Angka ke : " + i);
        }
        System.out.println(this.name + " selesai");
    }

    //Main
    //di class "LatihanThreadRun"
}