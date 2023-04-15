package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Getter;

@NoArgsConstructor
@ToString(callSuper = true)
@Getter

public class Tricycle extends AbstractBicycle {
    public static final String HEADERS = "withTrunk, wheelDistance";
    private boolean withTrunk;
    private float rareWheelDistanceInCentimeter;

    @Override
    public float getMaxDistanceInKM() {
        return 0;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + isWithTrunk() + ", " + getRareWheelDistanceInCentimeter();
    }

    public Tricycle(final String bikeBrand, final int bikeMaxSpeedInMPH, final int bikeCurrentSpeedInMPH,
                    final boolean withTrunk, final float rareWheelDistanceInCentimeter) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.withTrunk = withTrunk;
        this.rareWheelDistanceInCentimeter = rareWheelDistanceInCentimeter;
    }
}