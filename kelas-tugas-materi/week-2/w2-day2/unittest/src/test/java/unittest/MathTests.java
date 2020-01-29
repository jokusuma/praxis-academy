package unittest;

import org.junit.Test;
//import org.junit.Assert;
import static junit.framework.Assert.*;

public class MathTests {
    @Test //Harus import rg.junit.Test
    @SuppressWarnings("deprecation")
    public void add_TwoPlusTwo_ReturnFour(){
        // Arrange
        final int expected = 5;

        // Act
        final int actual = Math.add(3, 2);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void multiplyTwoWithThreeReturnSix(){
        final int expected = 6;
        final int actual = Math.multiply(3, 2);
        assertEquals(expected, actual);
    }

    @Test
    @SuppressWarnings("deprecation")
    public void DivideTenByFiveReturnTwo(){
        final double expected = 2;
        final double actual = Math.divide(10, 5);
        System.out.println(expected+" "+actual);
        assertEquals(expected, actual);
    }

    // @Test(expectedExceptions = IllegalArgumentException.class)
    // Bisa pakai expected saja atau : https://stackoverflow.com/questions/49537960/the-attribute-expected-is-undefined-for-the-annotation-type-test
    @Test(expected = IllegalArgumentException.class)
    public void divide_TenDividedByZero_ThrowsIllegalArgumentException() {
        Math.divide(10, 0);
    }
}