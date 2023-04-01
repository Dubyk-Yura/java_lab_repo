package ua.lviv.iot.algo.part1.lab2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class AbstractBicycle {
    private String bikeBrand;
    private int bikeMaxSpeedInMPH;
    private int bikeCurrentSpeedInMPH;

    abstract float getMaxDistanceInKM();


}
