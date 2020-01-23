//Create class Bicycle
public class Bicycle{
    //Create Attribute - Bicycle has 3 fields
    public int cadence;
    public int gear;
    public int speed;

    //Create Constructor - bicycle has 1 constructor
    public Bicycle(int inCadence, int inGear, int inSpeed){
        cadence = inCadence;
        gear = inGear;
        speed = inSpeed;
    }

    //Create method - bicycle has 4 methods
    public void setCadence(int newValue){
        cadence = newValue;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void ApplyBreak(int decrement){
        speed -= decrement;
    }
    public void SpeedUp(int increment){
        speed += increment;
    }


}