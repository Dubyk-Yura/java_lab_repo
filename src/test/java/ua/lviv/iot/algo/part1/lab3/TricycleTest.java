package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TricycleTest {
    Tricycle bicycle2 = new Tricycle();

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(0, bicycle2.getMaxDistanceInKm(), 0.001F);
    }
}