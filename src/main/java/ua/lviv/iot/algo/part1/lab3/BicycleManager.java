package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Getter

public class BicycleManager {
    final List<AbstractBicycle> bicycleList = new LinkedList<>();

    public List<AbstractBicycle> findAllWithMaxSpeedHigherThan(int maxSpeed) {
        return bicycleList.stream().
                filter(bicycle -> bicycle.
                        getBikeMaxSpeedInMPH() > maxSpeed).
                collect(Collectors.toList());
    }

    public List<AbstractBicycle> findAllWithCurrentSpeedLowerThan(int currentSpeed) {
        return bicycleList.stream().
                filter(bicycle -> bicycle.
                        getBikeCurrentSpeedInMPH() < currentSpeed).
                collect(Collectors.toList());
    }

    public void addBicycle(final AbstractBicycle bicycle) {
        this.bicycleList.add(bicycle);
    }

    public List<AbstractBicycle> getBicycleList() {
        return bicycleList;
    }

}
