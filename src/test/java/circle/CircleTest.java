package circle;

import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {
    private final double DELTA = 0.0000000000000001;
    @Test
    public void testToStringOfCircle() {
        Circle circle = new Circle(4.5, "red");
        String expected = "A red circle with radius = 4.5";

        String actual = circle.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testVolumeOfCylinder() {
        Cylinder cylinder = new Cylinder(4.3,"yellow", 10);
        double expected = 580.8804816487527;

        double actual = cylinder.getVolume();
        assertEquals(expected, actual, DELTA);
    }
}