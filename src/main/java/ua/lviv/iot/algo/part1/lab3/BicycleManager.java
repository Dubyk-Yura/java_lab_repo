package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;

import java.io.PrintWriter;
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

    public static void main(String[] args) {
      BicycleWriter bicycleWriter = new BicycleWriter();
        List<AbstractBicycle> bicycleManager = new LinkedList<>();
        bicycleManager.add(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        bicycleManager.add(new ElectroBicycle("Electro", 25, 5, 60, 20));
        bicycleManager.add(new Bicycle("Apple", 7, 4, "mountain"));
        bicycleManager.add(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        bicycleManager.add(new Unicycle("Uni-company", 3, 2, 2, 1));
        bicycleManager.add(new Unicycle("Evil Company", 4, 1, 3, 2));
        bicycleManager.add(new Tricycle("Tri-company", 10, 6, true, 0.8F));
        bicycleManager.add(new Tricycle("Company", 14, 9, false, 0.9F));

       bicycleWriter.sortedWrite(bicycleManager);
    }
}
