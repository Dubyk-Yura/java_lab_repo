package ua.lviv.iot.algo.part1.lab2;


import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class Bicycle extends AbstractBicycle {
    private static double priceIncrementUah = 10000;
    private String bikeType;
    @Override
    float getMaxDistanceInKM() {
        return Integer.MAX_VALUE;
    }

    public Bicycle(String bikeBrand, int bikeMaxSpeedInMPH, int bikeCurrentSpeedInMPH, String bikeType) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.bikeType = bikeType;
    }
}

