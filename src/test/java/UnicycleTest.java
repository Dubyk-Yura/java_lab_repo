import ua.lviv.iot.algo.part1.lab3.Unicycle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UnicycleTest {
    Unicycle bicycle2 = new Unicycle();
    Unicycle bicycle = new Unicycle("Uni-company", 3, 2, 2, 1);

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(0.1F, bicycle.getMaxDistanceInKM(), 0.001F);
    }
}