package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleTest {
    Bicycle bicycle = new Bicycle("Xiaomi", 40, 39, "non-mountain");

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(Integer.MAX_VALUE, bicycle.getMaxDistanceInKm(), 0.001F);
    }

    @Test
    public void testHeaders() {
        assertEquals("bikeBrand, maxSpeed, currentSpeed, bikeType", bicycle.getHeaders());
    }

    @Test
    public void testToCsv() {
        assertEquals("Xiaomi, 40, 39, non-mountain", bicycle.toCsv());
    }
}
