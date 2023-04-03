import org.junit.Test;
import ua.lviv.iot.algo.part1.lab3.Bicycle;

import static org.junit.Assert.*;
public class BicycleTest extends Bicycle {
    Bicycle bicycle = new Bicycle("Apple", 7, 4, "mountain");
    @Test
    public void testGetMaxDistanceInKM(){
        assertEquals (Integer.MAX_VALUE,bicycle.getMaxDistanceInKM(),0.001F);
    }
}
