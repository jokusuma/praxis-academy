public interface MyInterface {
    public void run(){
        System.out.println("test RUN aja");
    };

    //Get

    //Set

    public static void main(String[] args) {
        MyInterface obyek = new MyInterface(); 
        obyek.run();
    }
}