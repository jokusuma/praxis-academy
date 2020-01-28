package Bicycle;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class BicycleTest {
    
    Bicycle bicycle;

    @Before
    public void init(){
        bicycle = new Bicycle();
    }

    @Test
    public void testCadence(){
        // Arrange
        final int expected = 50;

        // Act
        bicycle.changeCadence(50);
        // final int actual = bicycle.cadence;
        final int actual = bicycle.getCadence();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testSpeedUp(){
        // Arrange
        final int expected = 30;

        // Act
        bicycle.speedUp(30);
        final int actual = bicycle.getSpeed();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testChangeGear(){
        // Arrange
        final int expected = 5;

        // Act
        bicycle.changeGear(5);
        final int actual = bicycle.getGear();

        // Assert
        assertEquals(expected, actual);
    }
}