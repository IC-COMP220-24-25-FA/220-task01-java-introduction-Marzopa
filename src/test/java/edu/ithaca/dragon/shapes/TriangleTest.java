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
}
