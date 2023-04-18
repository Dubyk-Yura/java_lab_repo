package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnicycleTest {
    Unicycle bicycle2 = new Unicycle();
    Unicycle bicycle = new Unicycle("Uni-company", 3, 2, 2, 1);

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(0.1F, bicycle.getMaxDistanceInKm(), 0.001F);
    }
    @Test
    public void testHeaders() {
        assertEquals("bikeBrand, maxSpeed, currentSpeed, seatLiftHeightInMeter, wheelRadius", bicycle.getHeaders());
    }

    @Test
    public void testToCsv() {
        assertEquals("Uni-company, 3, 2, 2, 1", bicycle.toCsv());
    }
}