public class BicycleRun{
    public static void main(String[] args) {
        //create object
        // Bicycle newBike = new Bicycle(10, 20, 30);
        // System.out.println(newBike.cadence + " " + newBike.gear + " " + newBike.speed);

        MountainBike newBike = new MountainBike(10, 20, 30, 40);
        System.out.println(newBike.seatHeight);
        System.out.println(newBike.cadence);
        System.out.println(newBike.speed);
        System.out.println(newBike.gear);
    }
}