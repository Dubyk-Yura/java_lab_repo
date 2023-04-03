package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Getter
public class Tricycle extends AbstractBicycle {
    private boolean withTrunk;
    private float rareWheelDistanceInCentimeter;

    @Override
    public float getMaxDistanceInKM() {
        return 0;
    }

    public Tricycle(String bikeBrand, int bikeMaxSpeedInMPH, int bikeCurrentSpeedInMPH,
                    boolean withTrunk, float rareWheelDistanceInCentimeter) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.withTrunk = withTrunk;
        this.rareWheelDistanceInCentimeter = rareWheelDistanceInCentimeter;
    }
}