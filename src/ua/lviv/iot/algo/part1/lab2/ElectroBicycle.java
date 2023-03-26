package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class ElectroBicycle extends AbstractBicycle{
    private int bikeBatteryCapacityInmAh;
    private float bikeChargeConsumptionFor100m;

    @Override
    float getMaxDistanceInKM() {
        return bikeBatteryCapacityInmAh/bikeChargeConsumptionFor100m;
    }

    public ElectroBicycle(String bikeBrand, int bikeMaxSpeedInMPH, int bikeCurrentSpeedInMPH, int bikeBatteryCapacityInmAh, float bikeChargeConsumptionFor100m) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.bikeBatteryCapacityInmAh = bikeBatteryCapacityInmAh;
        this.bikeChargeConsumptionFor100m = bikeChargeConsumptionFor100m;
    }
}
