import ua.lviv.iot.algo.part1.lab3.Bicycle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BicycleTest {
    Bicycle bicycle = new Bicycle();

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(Integer.MAX_VALUE, bicycle.getMaxDistanceInKM(), 0.001F);
    }

    @Test
    public void testGetHeadersSmartly(){
        Bicycle bicycle1 = new Bicycle();
        System.out.println(bicycle1.getHeadersSmartly());

    }
}
