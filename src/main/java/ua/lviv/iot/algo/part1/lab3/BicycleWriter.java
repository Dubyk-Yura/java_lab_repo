package ua.lviv.iot.algo.part1.lab3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BicycleWriter {
    String csvFile = "bicycle.csv";

    public String write(List<AbstractBicycle> bicycles) {
        if (bicycles == null || bicycles.isEmpty()) {
            return null;
        }
        String defaultFileName = "result.csv";
        try (FileWriter writer = new FileWriter(defaultFileName)) {
            for (var bicycle : bicycles) {
                writer.write(bicycle.getHeaders());

                writer.write("\r\n");
                writer.write(bicycle.toCSV());
                writer.write("\r\n");
            }
        } catch (IOException e) {

        } finally {

        }

        return defaultFileName;
    }

}