package ua.lviv.iot.algo.part1.lab3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class BicycleWriter {
    String csvFile = String.format("%s%s%s%s%s", System.getProperty("user.dir"), File.separator, "src\\main\\resources", File.separator, "result.csv");

    public String write(List<AbstractBicycle> bicycles) {
        if (bicycles == null || bicycles.isEmpty()) {
            return null;
        }

        try (FileWriter writer = new FileWriter(csvFile)) {
            for (AbstractBicycle bicycle: bicycles ) {
                writer.write(bicycle.getHeaders());

                writer.write("\r\n");
                writer.write(bicycle.toCSV());
                writer.write("\r\n");
            }

        } catch (IOException e) {
            e.fillInStackTrace();
        }

        return csvFile;
    }

}