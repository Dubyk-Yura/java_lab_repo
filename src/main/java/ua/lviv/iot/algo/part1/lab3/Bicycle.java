package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Getter;

@NoArgsConstructor
@ToString(callSuper = true)
@Getter
public class Bicycle extends AbstractBicycle {
    public static final String HEADERS = "bikeType";
    private String bikeType;

    @Override
    public float getMaxDistanceInKm() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCsv() {
        return super.toCsv() + ", " + getBikeType();
    }

    public Bicycle(final String bikeBrand, final int bikeMaxSpeedInMph,
                   final int bikeCurrentSpeedInMph, final String bikeType) {
        super(bikeBrand, bikeMaxSpeedInMph, bikeCurrentSpeedInMph);
        this.bikeType = bikeType;
    }
}