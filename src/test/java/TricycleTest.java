import ua.lviv.iot.algo.part1.lab3.Tricycle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TricycleTest extends Tricycle {
    Tricycle bicycle = new Tricycle();

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(0, bicycle.getMaxDistanceInKM(), 0.001F);
    }
}