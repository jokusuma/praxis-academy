public class RaceCar {
    // Create method FullSpeed
    public void FullSpeed(){
        System.out.println("Mobil dijalankan dengan kecepatan penuh");
    }
    // Create method Speed. The speed() method accepts an int parameter called maxSpeed
    public void Speed(int maxSpeed){
        // int maxSpeed = 140;
        System.out.println("Kecepatan nya adalah : " + maxSpeed);
    }
    // Call the methods
    public static void main(String[] args) {
        // Create an object to access the public method
        RaceCar lambo = new RaceCar();
        // Calling the method
        lambo.FullSpeed();
        lambo.Speed(200);
    }
}