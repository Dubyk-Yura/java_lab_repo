package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleTest {
    Bicycle bicycle = new Bicycle();

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(Integer.MAX_VALUE, bicycle.getMaxDistanceInKM(), 0.001F);
    }
}
