package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString(callSuper = true)
@Getter
public class Unicycle extends AbstractBicycle {
    public static final String HEADERS = "seatLiftHeightInMeter, wheelRadius";
    private int seatLiftHeightInMeter;
    private int wheelRadius;

    @Override
    public float getMaxDistanceInKm() {
        return 0.1F;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    @Override
    public String toCsv() {
        return super.toCsv() + ", " + getSeatLiftHeightInMeter() + ", " + getWheelRadius();
    }

    public Unicycle(final String bikeBrand, final int bikeMaxSpeedInMph,
                    final int bikeCurrentSpeedInMph,
                    final int seatLiftHeightInMeter, final int wheelRadius) {
        super(bikeBrand, bikeMaxSpeedInMph, bikeCurrentSpeedInMph);
        this.seatLiftHeightInMeter = seatLiftHeightInMeter;
        this.wheelRadius = wheelRadius;
    }
}
