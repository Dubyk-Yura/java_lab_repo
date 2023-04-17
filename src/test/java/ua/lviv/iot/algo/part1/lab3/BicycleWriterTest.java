package ua.lviv.iot.algo.part1.lab3;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Assertions;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class BicycleWriterTest {
    private static final String RESULT_FILENAME = Paths.get(System
                    .getProperty("user.dir"), "src", "main", "resources", "result.csv")
            .toString();
    private static final String EXPECTED_FILENAME = Paths.get(System
                    .getProperty("user.dir"), "src", "main", "resources",
            "expected.csv").toString();
    private File expectedFile;
    private List<AbstractBicycle> bicycles;
    private BicycleWriter writer;
    private File result;

    @Before
    public void setUp() throws IOException {
        expectedFile = new File(EXPECTED_FILENAME);
        writer = new BicycleWriter();
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
        result = new File(RESULT_FILENAME);
        bicycles = new LinkedList<>();
        bicycles.add(new ElectroBicycle("Samsung", 30, 15, 50, 10));
        bicycles.add(new ElectroBicycle("Electro", 25, 5, 60, 20));
        bicycles.add(new Bicycle("Apple", 7, 4, "mountain"));
        bicycles.add(new Bicycle("Xiaomi", 40, 39, "non-mountain"));
        bicycles.add(new Unicycle("Uni-company", 3, 2, 2, 1));
        bicycles.add(new Unicycle("Evil Company", 4, 1, 3, 2));
        bicycles.add(new Tricycle("Tri-company", 10, 6, true, 0.8F));
        bicycles.add(new Tricycle("Company", 14, 9, false, 0.9F));
    }

    @After
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));
    }

    @Test
    public void testWriteListOfBicycles() throws IOException {
        writer.write(bicycles);
        Path expected = expectedFile.toPath();
        Path actual = result.toPath();
        Assertions.assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testEmptyWrite() throws IOException {
        writer.write(null);
        Assertions.assertFalse(result.exists());
    }

    @Test
    public void testFileOverride() throws IOException {
        List<AbstractBicycle> tempBicycle = new LinkedList<>();
        tempBicycle.add(new Tricycle("Company", 14, 9, false, 0.9F));
        writer.write(tempBicycle);
        testWriteListOfBicycles();
    }
}
