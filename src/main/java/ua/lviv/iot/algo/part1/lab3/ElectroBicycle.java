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
    public float getMaxDistanceInKm() {
        return bikeBatteryCapacityInmAh / bikeConsumptionPer100m;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCsv() {
        return super.toCsv() + ", " + getBikeBatteryCapacityInmAh() + ", "
                + getBikeConsumptionPer100m();
    }

    public ElectroBicycle(final String bikeBrand, final int bikeMaxSpeedInMph,
                          final int bikeCurrentSpeedInMph,
                          final int bikeBatteryCapacityInmAh,
                          final int bikeConsumptionPer100m) {
        super(bikeBrand, bikeMaxSpeedInMph, bikeCurrentSpeedInMph);
        this.bikeBatteryCapacityInmAh = bikeBatteryCapacityInmAh;
        this.bikeConsumptionPer100m = bikeConsumptionPer100m;
    }
}