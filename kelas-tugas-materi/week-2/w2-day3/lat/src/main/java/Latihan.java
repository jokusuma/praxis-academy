//https://www.kurungkurawal.com/2011/04/25/aplikasi-multithread-dengan-java/
public class Latihan {
    //Create Attributes

    //Constructor

    //Method
    void count(){
        for(int i=1; i <= 10; i++){
            System.out.println("index ke " + i);
        }
    }
    //Run
    public static void main(String[] args) {
        
        //Create object/instance
        Latihan angka = new Latihan();
        //Print
        angka.count();
    }
}