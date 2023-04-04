import ua.lviv.iot.algo.part1.lab3.ElectroBicycle;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectroBicycleTest extends ElectroBicycle {
    ElectroBicycle bicycle = new ElectroBicycle();

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(bicycle.getBikeBatteryCapacityInmAh() / bicycle.getBikeConsumptionPer100m(),
                bicycle.getMaxDistanceInKM(), 0.001F);
    }
}