package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Getter;

@NoArgsConstructor
@ToString(callSuper = true)
@Getter

public class ElectroBicycle extends AbstractBicycle {
    public static final String HEADERS = "batteryCapacity, consumption";

    private int bikeBatteryCapacityInmAh;
    private float bikeConsumptionPer100m;

    @Override
    public float getMaxDistanceInKM() {
        return bikeBatteryCapacityInmAh / bikeConsumptionPer100m;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + getBikeBatteryCapacityInmAh() + ", " + getBikeConsumptionPer100m();
    }

    public ElectroBicycle(final String bikeBrand, final int bikeMaxSpeedInMPH, final int bikeCurrentSpeedInMPH,
                          final int bikeBatteryCapacityInmAh, final int bikeConsumptionPer100m) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.bikeBatteryCapacityInmAh = bikeBatteryCapacityInmAh;
        this.bikeConsumptionPer100m = bikeConsumptionPer100m;
    }
}