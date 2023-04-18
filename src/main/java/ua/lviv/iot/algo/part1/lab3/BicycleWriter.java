package ua.lviv.iot.algo.part1.lab3;

import java.io.FileWriter;
import java.io.IOException;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BicycleWriter {
    final static String CSVFILE = Paths.get(System.getProperty("user.dir"),
            "src", "main", "resources", "result.csv").toString();
    final static String SORTEDCSVFILE =
            Paths.get(System.getProperty("user.dir"),
                    "src", "main", "resources", "sortedResult.csv").toString();

    public String write(List<AbstractBicycle> bicycles) {
        if (bicycles == null || bicycles.isEmpty()) {
            return null;
        }
        try (FileWriter writer = new FileWriter(CSVFILE)) {
            AbstractBicycle tempObj = bicycles.get(0);
            writer.write(bicycles.get(0).getHeaders());
            writer.write(System.lineSeparator());
            for (AbstractBicycle bicycle : bicycles) {
                if (bicycle.getClass() != tempObj.getClass()) {
                    tempObj = bicycle;
                    writer.write(bicycle.getHeaders());
                    writer.write(System.lineSeparator());
                }
                writer.write(bicycle.toCsv());
                writer.write(System.lineSeparator());
            }

        } catch (IOException e) {
            e.fillInStackTrace();
        }
        return CSVFILE;
    }

    @lombok.Generated
    public String sortedWrite(List<AbstractBicycle> bicycles) {
        Map<String, List<AbstractBicycle>> sortedList = new HashMap<>();
        String bicycleKey = Bicycle.class.toString();
        String electroBicycleKey = ElectroBicycle.class.toString();
        String tricycleKey = Tricycle.class.toString();
        String unicycleKey = Unicycle.class.toString();
        sortedList.put(bicycleKey, new LinkedList<>());
        sortedList.put(electroBicycleKey, new LinkedList<>());
        sortedList.put(tricycleKey, new LinkedList<>());
        sortedList.put(unicycleKey, new LinkedList<>());

        if (bicycles == null || bicycles.isEmpty()) {
            return null;
        }
        try (FileWriter writer = new FileWriter(SORTEDCSVFILE)) {
            Set<String> keys = sortedList.keySet();
            for (AbstractBicycle bicycle : bicycles) {
                for (String key : keys) {
                    if (bicycle.getClass().toString().equals(key)) {
                        sortedList.get(key).add(bicycle);
                    }
                }
            }

            for (String key : keys) {
                writer.write(sortedList.get(key).get(1).getHeaders());
                writer.write(System.lineSeparator());
                for (int i = 0; i < sortedList.get(key).size(); i++) {
                    writer.write(sortedList.get(key).get(i).toCsv());
                    writer.write(System.lineSeparator());
                }
            }

        } catch (IOException e) {
            e.fillInStackTrace();
        }
        return SORTEDCSVFILE;
    }
}