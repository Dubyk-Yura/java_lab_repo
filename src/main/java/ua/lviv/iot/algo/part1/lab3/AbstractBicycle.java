package ua.lviv.iot.algo.part1.lab3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AbstractBicycle {
    public static final String HEADERS = "bikeBrand, maxSpeed, currentSpeed";
    private String bikeBrand;
    private int bikeMaxSpeedInMph;
    private int bikeCurrentSpeedInMph;

    protected abstract float getMaxDistanceInKm();

    public String getHeaders() {
        return HEADERS;
    }

    public String toCsv() {
        return getBikeBrand() + ", " + getBikeMaxSpeedInMph() + ", " + getBikeCurrentSpeedInMph();
    }


    public boolean equalsObj(AbstractBicycle obj) {
        return this.getBikeBrand().equals(obj.getBikeBrand())
                && this.getBikeMaxSpeedInMph() == obj.getBikeMaxSpeedInMph()
                && this.getBikeCurrentSpeedInMph() == obj.getBikeCurrentSpeedInMph();
    }
}
