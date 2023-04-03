import lombok.Getter;
import org.junit.Test;
import ua.lviv.iot.algo.part1.lab3.AbstractBicycle;
import ua.lviv.iot.algo.part1.lab3.Bicycle;
import ua.lviv.iot.algo.part1.lab3.BicycleManager;
import ua.lviv.iot.algo.part1.lab3.ElectroBicycle;
import ua.lviv.iot.algo.part1.lab3.Tricycle;
import ua.lviv.iot.algo.part1.lab3.Unicycle;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class BicycleManagerTest {
    final List<AbstractBicycle> bicycleList = new ArrayList<>();

    public void addBicycle(final AbstractBicycle bicycle) {
        this.bicycleList.add(bicycle);
    }

    @Test
    public void testFindAllWithMaxSpeedHigherThan() {
        List<AbstractBicycle> bicycleList = new ArrayList<>();
        bicycleList.add(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        bicycleList.add(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        bicycleList.add(new Unicycle("Evil Company", 4, 1, 3, 2));
        bicycleList.add(new Tricycle("Tri-company", 10, 6, true, 0.8F));

        List<AbstractBicycle> sortedList = bicycleList.stream().
                filter(bicycle -> bicycle.
                        getBikeMaxSpeedInMPH() > 28).
                collect(Collectors.toList());
        List<AbstractBicycle> expectedList = new ArrayList<>();
        expectedList.add(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        expectedList.add(new Bicycle("Xiaomi", 40, 39, "non-mountain"));

        assertEquals(sortedList.size(), expectedList.size());
    }

    @Test
    public void testFindAllWithCurrentSpeedLowerThan() {
        List<AbstractBicycle> bicycleList = new ArrayList<>();
        bicycleList.add(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        bicycleList.add(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        bicycleList.add(new Unicycle("Evil Company", 4, 1, 3, 2));
        bicycleList.add(new Tricycle("Tri-company", 10, 6, true, 0.8F));

        List<AbstractBicycle> sortedList = bicycleList.stream().
                filter(bicycle -> bicycle.
                        getBikeCurrentSpeedInMPH() < 20).
                collect(Collectors.toList());
        List<AbstractBicycle> expectedList = new ArrayList<>();
        expectedList.add(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        expectedList.add(new Unicycle("Evil Company", 4, 1, 3, 2));
        expectedList.add(new Tricycle("Tri-company", 10, 6, true, 0.8F));
        assertEquals(sortedList.size(), expectedList.size());
    }

    @Test
    public void testAddBicycle() {
        BicycleManager bicycleManager = new BicycleManager();
        bicycleManager.addBicycle(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        bicycleManager.addBicycle(new ElectroBicycle("Electro", 25, 5, 60, 20));
        bicycleManager.addBicycle(new Bicycle("Apple", 7, 4, "mountain"));
        bicycleManager.addBicycle(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        bicycleManager.addBicycle(new Unicycle("Uni-company", 3, 2, 2, 1));
        bicycleManager.addBicycle(new Unicycle("Evil Company", 4, 1, 3, 2));
        bicycleManager.addBicycle(new Tricycle("Tri-company", 10, 6, true, 0.8F));
        bicycleManager.addBicycle(new Tricycle("Company", 14, 9, false, 0.9F));

        assertEquals(8, bicycleManager.getBicycleList().size());

    }

}
