package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Getter;

import java.lang.reflect.Field;

@NoArgsConstructor
@ToString(callSuper = true)
@Getter
public class Bicycle extends AbstractBicycle {
    public static final String HEADERS = "bikeType";
    private String bikeType;

    @Override
    public float getMaxDistanceInKM() {
        return Integer.MAX_VALUE;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + getBikeType();
    }

    public Bicycle(final String bikeBrand, final int bikeMaxSpeedInMPH,
                   final int bikeCurrentSpeedInMPH, final String bikeType) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.bikeType = bikeType;
    }
}