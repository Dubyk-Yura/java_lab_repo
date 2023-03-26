package ua.lviv.iot.algo.part1.lab2;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Tricycle extends AbstractBicycle{
    private boolean withTrunk;
    private float rareWheelDistanceInCentimeter;
    @Override
    float getMaxDistanceInKM() {
        return 0;
    }

    public Tricycle(String bikeBrand, int bikeMaxSpeedInMPH, int bikeCurrentSpeedInMPH, boolean withTrunk, float rareWheelDistanceInCentimeter) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.withTrunk = withTrunk;
        this.rareWheelDistanceInCentimeter = rareWheelDistanceInCentimeter;
    }
}
