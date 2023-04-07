import lombok.Getter;
import ua.lviv.iot.algo.part1.lab3.AbstractBicycle;
import ua.lviv.iot.algo.part1.lab3.Bicycle;
import ua.lviv.iot.algo.part1.lab3.BicycleManager;
import ua.lviv.iot.algo.part1.lab3.ElectroBicycle;
import ua.lviv.iot.algo.part1.lab3.Tricycle;
import ua.lviv.iot.algo.part1.lab3.Unicycle;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

@Getter
public class BicycleManagerTest {
    BicycleManager bicycles = new BicycleManager();

    @Test
    public void testAddBicycle() {
       for (int i = 0; i<5;i++){
           bicycles.addBicycle(new Bicycle());
       }
        assertEquals(5,bicycles.getBicycleList().size() );
    }

    @Test
    public void testFindAllWithCurrentSpeedLowerThan() {
        bicycles.addBicycle(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        bicycles.addBicycle(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        bicycles.addBicycle(new Unicycle("Evil Company", 4, 1, 3, 2));
        bicycles.addBicycle(new Tricycle("Tri-company", 10, 6, true, 0.8F));

        List<AbstractBicycle> expectedBikes = new LinkedList<>();
        expectedBikes.add(new Unicycle("Evil Company", 4, 1, 3, 2));
        expectedBikes.add(new Tricycle("Tri-company", 10, 6, true, 0.8F));
        assertEquals(expectedBikes.toString(),bicycles.findAllWithCurrentSpeedLowerThan(10).toString());
    }

    @Test
    public void testFindAllWithMaxSpeedHigherThan(){
        bicycles.addBicycle(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        bicycles.addBicycle(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        bicycles.addBicycle(new Unicycle("Evil Company", 4, 1, 3, 2));
        bicycles.addBicycle(new Tricycle("Tri-company", 10, 6, true, 0.8F));

        List<AbstractBicycle> expectedBikes = new LinkedList<>();
        expectedBikes.add(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        expectedBikes.add(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        expectedBikes.add(new Tricycle("Tri-company", 10, 6, true,0.8F));
        assertEquals(expectedBikes.toString(),bicycles.findAllWithMaxSpeedHigherThan(5).toString());
    }
}
