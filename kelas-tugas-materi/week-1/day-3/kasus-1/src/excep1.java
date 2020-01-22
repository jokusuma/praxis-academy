/**
 * <p> Ini adalah hasil pembelajaran hari ke 2 dimana siswa di minta untuk melakukan exception atau error handling dengan metode try, catch dan finally</p>
 * Link latihannya ada di sini <a>https://github.com/praxis-academy/akademik/blob/master/kurikulum/enterprise-full-stack/isi/01.md</a>
 * @author Jojo
 * @version 1.0
 * @param main()
 */

public class excep1 {
    public static void main(String[] args) {
        try {
            String[] students = {"andy", "budi", "chandra"};
            System.out.println(students[3]);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("OK" + e);
        } finally {
            System.out.println("Done");
        }       
    }
}