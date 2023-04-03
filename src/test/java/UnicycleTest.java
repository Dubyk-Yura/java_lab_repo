import org.junit.Test;
import ua.lviv.iot.algo.part1.lab3.Unicycle;

import static org.junit.Assert.*;
public class UnicycleTest extends Unicycle {
    Unicycle bicycle=  new Unicycle("Uni-company", 3, 2, 2, 1);

    @Test
    public void testGetMaxDistanceInKM(){
        assertEquals (0.1F,bicycle.getMaxDistanceInKM(),0.001F);
    }
}