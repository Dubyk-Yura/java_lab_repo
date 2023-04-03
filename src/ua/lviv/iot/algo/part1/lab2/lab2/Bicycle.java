package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Getter
public class Bicycle extends AbstractBicycle {
    private String bikeType;

    @Override
    public float getMaxDistanceInKM() {
        return Integer.MAX_VALUE;
    }

    public Bicycle(String bikeBrand, int bikeMaxSpeedInMPH, int bikeCurrentSpeedInMPH, String bikeType) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.bikeType = bikeType;
    }

}

