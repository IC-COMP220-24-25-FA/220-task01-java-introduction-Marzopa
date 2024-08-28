package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void calcAreaTest(){
        Rectangle testRectangle = new Rectangle(4, 5);
        assertEquals(20, testRectangle.calcArea());

        testRectangle = new Rectangle(2, 0.5);
        assertEquals(1, testRectangle.calcArea());
    }

    @Test
    public void doubleSizeTest(){
        Rectangle testRectangle = new Rectangle(4, 5);
        testRectangle.doubleSize();
        assertEquals(80, testRectangle.calcArea());

        testRectangle = new Rectangle(0.5, 2);
        testRectangle.doubleSize();
        assertEquals(4, testRectangle.calcArea());
    }
}
