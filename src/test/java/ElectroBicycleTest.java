import org.junit.Test;
import ua.lviv.iot.algo.part1.lab3.ElectroBicycle;

import static org.junit.Assert.*;
public class ElectroBicycleTest extends ElectroBicycle {
     ElectroBicycle bicycle=  new ElectroBicycle("Samsung", 30, 15, 50,10);
    @Test
    public void testGetMaxDistanceInKM(){
        assertEquals (bicycle.getBikeBatteryCapacityInmAh()/bicycle.getBikeConsumptionPer100m(),bicycle.getMaxDistanceInKM(),0.001F);
    }
}