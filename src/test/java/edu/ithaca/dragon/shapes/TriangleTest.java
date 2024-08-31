package edu.ithaca.dragon.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    public void calcAreaTest(){
        Triangle test = new Triangle(3, 5);
        assertEquals(7.5, test.calcArea());

        test = new Triangle(1,2);
        assertEquals(1, test.calcArea());
    }

    @Test
    public void doubleSizeTest(){
        Triangle test = new Triangle(1, 2);
        test.doubleSize();
        assertEquals(4, test.calcArea());

        test = new Triangle(0.5, 1);
        test.doubleSize();
        assertEquals(1, test.calcArea());
    }

    @Test
    public void longestLineWithinTest(){
        Triangle test = new Triangle(2, 2);
        assertEquals(2.2360679775, test.longestLineWithin(), 0.00001);

        test = new Triangle(4, 2);
        assertEquals(2.8284271247, test.longestLineWithin(), 0.00001);
    }
}
