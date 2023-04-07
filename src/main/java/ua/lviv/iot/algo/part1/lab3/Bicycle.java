package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Getter;

@NoArgsConstructor
@ToString(callSuper = true)
@Getter
public class Bicycle extends AbstractBicycle {
    private String bikeType;

    @Override
    public float getMaxDistanceInKM() {
        return Integer.MAX_VALUE;
    }

    public Bicycle(final String bikeBrand, final int bikeMaxSpeedInMPH,
                   final int bikeCurrentSpeedInMPH, final String bikeType) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.bikeType = bikeType;
    }
}