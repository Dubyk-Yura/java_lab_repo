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
    private int bikeMaxSpeedInMPH;
    private int bikeCurrentSpeedInMPH;

    protected abstract float getMaxDistanceInKM();

    public String getHeaders() {
        return HEADERS;
    }

    public String toCSV() {
        return getBikeBrand() + ", " + getBikeMaxSpeedInMPH() + ", " + getBikeCurrentSpeedInMPH();
    }


    public boolean equalsObj(AbstractBicycle obj) {
        return this.getBikeBrand().equals(obj.getBikeBrand())
                && this.getBikeMaxSpeedInMPH() == obj.getBikeMaxSpeedInMPH()
                && this.getBikeCurrentSpeedInMPH() == obj.getBikeCurrentSpeedInMPH();
    }
}
