//Create Class
public class Constructor1 {
    //Create attributes
    public int cadence;
    public int gear;
    public int speed;

    //Create constructor for the Constructor1 class
    //parameter (yg di dlm kurung) adalah yg di kanan sama dengan.
    //bila tidak menggunakan parameter, boleh langsung di assign, misal: cadence = 30
    public Constructor1(int incadence, int ingear, int inspeed){
        cadence = incadence;
        gear = ingear;
        speed = inspeed;
    }

    public static void main(String[] args) {
        //create object to access public method
        Constructor1 newBike = new Constructor1(10, 20, 30);
        System.out.println("Cadence : " + newBike.cadence);
        System.out.println("Gear : " + newBike.gear);
        System.out.println("Speed : " + newBike.speed);
    }
}