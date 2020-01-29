public class LatThreadLagi implements Runnable{
    //Create Attr
    String namaAngka;
    String namaHuruf;

    //Constructor
    void namaAngka(String namaAngka){
        this.namaAngka = namaAngka; //klo pake this, harus sama
    }
    // void namaHuruf(String namaHuruf){
    //     this.namaHuruf = namaHuruf;
    // }

    //method
    @Override
    public void run(){
        for(int i = 1; i<=10;i++){
            System.out.println("Angka ke " + i);
        }
        System.out.println(namaAngka + " selesai");
    }
}