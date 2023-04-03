package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Getter
public class ElectroBicycle extends AbstractBicycle {
    private int bikeBatteryCapacityInmAh;
    private float bikeConsumptionPer100m;
    @Override
    public float getMaxDistanceInKM() {
        return bikeBatteryCapacityInmAh / bikeConsumptionPer100m;
    }

    public ElectroBicycle(String bikeBrand, int bikeMaxSpeedInMPH, int bikeCurrentSpeedInMPH,
                          int bikeBatteryCapacityInmAh, int bikeConsumptionPer100m) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.bikeBatteryCapacityInmAh = bikeBatteryCapacityInmAh;
        this.bikeConsumptionPer100m = bikeConsumptionPer100m;
    }
}