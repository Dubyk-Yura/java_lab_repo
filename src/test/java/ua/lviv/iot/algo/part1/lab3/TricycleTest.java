package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TricycleTest {
    Tricycle bicycle2 = new Tricycle("Tri-company", 10, 6, true, 0.8F);

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(0, bicycle2.getMaxDistanceInKm(), 0.001F);
    }
    @Test
    public void testHeaders() {
        assertEquals("bikeBrand, maxSpeed, currentSpeed, withTrunk, wheelDistance", bicycle2.getHeaders());
    }

    @Test
    public void testToCsv() {
        assertEquals("Tri-company, 10, 6, true, 0.8", bicycle2.toCsv());
    }
}