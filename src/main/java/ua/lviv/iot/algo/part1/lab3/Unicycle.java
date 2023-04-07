package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString(callSuper = true)
@Getter
public class Unicycle extends AbstractBicycle {
    private int seatLiftHeightInMeter;
    private int wheelRadius;

    @Override
    public float getMaxDistanceInKM() {
        return 0.1F;
    }

    public Unicycle(final String bikeBrand, final int bikeMaxSpeedInMPH, final int bikeCurrentSpeedInMPH,
                    final int seatLiftHeightInMeter, final int wheelRadius) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.seatLiftHeightInMeter = seatLiftHeightInMeter;
        this.wheelRadius = wheelRadius;
    }
}
