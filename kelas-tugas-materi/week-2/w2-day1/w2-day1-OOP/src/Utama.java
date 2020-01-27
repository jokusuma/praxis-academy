/**
 * 
 */

public class Utama{
    //Run
    public static void main(String[] args) {
        //Bikin object pelanggan dari class/prototype Customer
        Customer pelanggan = new Customer();
        //Run
        pelanggan.nama = "Jojo";
        pelanggan.beliMobil();
        System.out.println(pelanggan.nama);

        Supplier sup = new Supplier();
        sup.noRek = 123456789;
        sup.gajian();
        System.out.println(sup.noRek);
    }
}