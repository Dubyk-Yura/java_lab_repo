package ua.lviv.iot.algo.part1.lab3;

import lombok.Getter;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

@Getter
public class BicycleManagerTest {

    BicycleManager bicycles = new BicycleManager();
    List<AbstractBicycle> realBikes = new LinkedList<>();
    List<AbstractBicycle> expectedBikes = new LinkedList<>();

    @Before
    public void setUp() {
        realBikes.add(new Tricycle("Tri-company", 10, 6, true, 0.8F));
        realBikes.add(new Unicycle("Evil Company", 4, 1, 3, 2));
        realBikes.add(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        realBikes.add(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        expectedBikes.add(new Tricycle("Tri-company", 10, 6, true, 0.8F));
    }

    @Test
    public void testAddBicycle() {
        bicycles.addBicycle(new Tricycle("Tri-company", 10, 6, true, 0.8F));
        bicycles.addBicycle(new Unicycle("Evil Company", 4, 1, 3, 2));
        bicycles.addBicycle(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        bicycles.addBicycle(new Bicycle("Xiaomi", 40, 39, "non-mountain"));

        Assertions.assertEquals(4, bicycles.getBicycleList().size());
    }

    @Test
    public void testFindAllWithCurrentSpeedLowerThan() {
        expectedBikes.add(new Unicycle("Evil Company", 4, 1, 3, 2));
        expectedBikes.add(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        Assertions.assertTrue(realBikes.get(3).equalsObj(expectedBikes.get(2)));
        Assertions.assertTrue(realBikes.get(0).equalsObj(expectedBikes.get(0)));
        Assertions.assertTrue(realBikes.get(1).equalsObj(expectedBikes.get(1)));
    }

    @Test
    public void testFindAllWithMaxSpeedHigherThan() {
        expectedBikes.add(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        expectedBikes.add(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        Assertions.assertTrue(realBikes.get(2).equalsObj(expectedBikes.get(1)));
        Assertions.assertTrue(realBikes.get(0).equalsObj(expectedBikes.get(0)));
        Assertions.assertTrue(realBikes.get(3).equalsObj(expectedBikes.get(2)));
    }
}
