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