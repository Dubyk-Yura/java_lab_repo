package ua.lviv.iot.algo.part1.lab2;

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

    public static void main(String[] args) {
        BicycleManager bicycleManager = new BicycleManager();
        bicycleManager.addBicycle(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        bicycleManager.addBicycle(new ElectroBicycle("Electro", 25, 5, 60, 20));
        bicycleManager.addBicycle(new Bicycle("Apple", 7, 4, "mountain"));
        bicycleManager.addBicycle(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        bicycleManager.addBicycle(new Unicycle("Uni-company", 3, 2, 2, 1));
        bicycleManager.addBicycle(new Unicycle("Evil Company", 4, 1, 3, 2));
        bicycleManager.addBicycle(new Tricycle("Tri-company", 10, 6, true, 0.8F));
        bicycleManager.addBicycle(new Tricycle("Company", 14, 9, false, 0.9F));
        System.out.println("Print with for-each ->");
        for (AbstractBicycle bicycles : bicycleManager.bicycleList) {
            System.out.println(bicycles);
        }

        System.out.println("\n\nPrint with sort by maximum speed -> ");
        var bicycleSpeedGraterThen10 = bicycleManager.findAllWithMaxSpeedHigherThan(10);
        for (AbstractBicycle bicycles : bicycleSpeedGraterThen10) {
            System.out.println(bicycles);
        }

        System.out.println("\n\nPrint with sort by current speed -> ");
        var bicycleSpeedLessThen15 = bicycleManager.findAllWithCurrentSpeedLowerThan(15);
        for (AbstractBicycle bicycles : bicycleSpeedLessThen15) {
            System.out.println(bicycles);
        }

    }
}
