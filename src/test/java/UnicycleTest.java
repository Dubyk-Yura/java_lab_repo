import ua.lviv.iot.algo.part1.lab3.Unicycle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnicycleTest extends Unicycle {
    Unicycle bicycle = new Unicycle();

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(0.1F, bicycle.getMaxDistanceInKM(), 0.001F);
    }
}