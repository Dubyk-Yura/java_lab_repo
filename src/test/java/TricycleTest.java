import org.junit.Test;
import ua.lviv.iot.algo.part1.lab2.Tricycle;

import static org.junit.Assert.*;
public class TricycleTest extends Tricycle {
    Tricycle bicycle = new Tricycle("Company", 14, 9, false, 0.9F);
    @Test
    public void testGetMaxDistanceInKM(){
        assertEquals (0,bicycle.getMaxDistanceInKM(),0.001F);
    }
}