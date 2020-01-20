public class Branch {
    /* 
    public static void main(String[] args) {
        int a = 30;
        if (a < 10) {
            System.out.println("Lbh Kecil 10");
        } else {
            System.out.println("Lbh Besar 10");
        }
    }
    */

    public void condition() {
        int a = 30;
        if (a < 10) {
            System.out.println("Lbh Kecil 10");
        } else {
            System.out.println("Lbh Besar 10");
        }
    }
    public static void main(String[] args) {
        Branch test = new Branch();
        test.condition();
    }

}