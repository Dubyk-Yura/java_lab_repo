package ua.lviv.iot.algo.part1.lab3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectroBicycleTest {
    ElectroBicycle bicycle2 = new ElectroBicycle();
    ElectroBicycle bicycle = new ElectroBicycle("Electro", 25, 5, 60, 20);

    @Test
    public void testGetMaxDistanceInKM() {
        assertEquals(bicycle.getBikeBatteryCapacityInmAh() /
                        bicycle.getBikeConsumptionPer100m(),
                bicycle.getMaxDistanceInKm(), 0.001F);
    }
    @Test
    public void testHeaders() {
        assertEquals("bikeBrand, maxSpeed, currentSpeed, batteryCapacity, consumption", bicycle.getHeaders());
    }

    @Test
    public void testToCsv() {
        assertEquals("Electro, 25, 5, 60, 20.0", bicycle.toCsv());
    }

}