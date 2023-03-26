package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Unicycle extends  AbstractBicycle{
    private int seatLiftHeightInMeter;
    private int wheelRadius;

    @Override
    float getMaxDistanceInKM() {
        return 0.1F;
    }

    public Unicycle(String bikeBrand, int bikeMaxSpeedInMPH, int bikeCurrentSpeedInMPH, int seatLiftHeightInMeter, int wheelRadius) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.seatLiftHeightInMeter = seatLiftHeightInMeter;
        this.wheelRadius = wheelRadius;
    }
}
