import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import ua.lviv.iot.algo.part1.lab3.AbstractBicycle;
import ua.lviv.iot.algo.part1.lab3.Bicycle;
import ua.lviv.iot.algo.part1.lab3.BicycleWriter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

import static java.nio.file.Files.mismatch;


public class BicycleWritterTest {
    private static final String RESULT_FILENAME = "result.csv";
    private static final String EXPECTED_FILENAME = "expected.csv";
    private List<AbstractBicycle> bicycles;
    private BicycleWriter writer;

    @BeforeEach
    public void setUp() throws IOException {
        writer = new BicycleWriter();
        Files.deleteIfExists(Path.of(RESULT_FILENAME));//видаляння файлу якщо він існує
        bicycles = new LinkedList<>();
        bicycles.add(new Bicycle("Apple", 7, 4, "mountain"));
    }

    @AfterAll // виконується в самому кінці тесту
    public void tearDown() throws IOException {
        Files.deleteIfExists(Path.of(RESULT_FILENAME));//видаляння файлу якщо він існує

    }

    @Test
    void testEmptyWrite() throws IOException {
        writer.write(bicycles);
        File file = new File(RESULT_FILENAME);
        Assertions.assertFalse(file.exists());     //перевірити чи очікуваний файл сківпадає з написаним

    }

    @Test
    void testWriteListOfBicycles() throws IOException {
        writer.write(bicycles);
        File file = new File(RESULT_FILENAME);
        //  Assertions.assertEquals();     //перевірити чи очікуваний файл сківпадає з написаним
        Path expected = new File(EXPECTED_FILENAME).toPath();
        Path actual = new File(RESULT_FILENAME).toPath();
        Assertions.assertEquals(-1L, Files.mismatch(expected, actual));
    }

    @Test
    public void testFileOverride() throws IOException {
        //create result.csv
        // write some content there
        testWriteListOfBicycles();
    }
}
