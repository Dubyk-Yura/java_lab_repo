package ua.lviv.iot.algo.part1.lab3;

import java.io.FileWriter;
import java.io.IOException;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BicycleWriter {
    public void write(List<AbstractBicycle> bicycles, String placeWhereWriteFile) {
        if (bicycles != null && !bicycles.isEmpty()) {
            try (FileWriter writer = new FileWriter(placeWhereWriteFile)) {
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
        }
    }

    @lombok.Generated
    public void sortedWrite(List<AbstractBicycle> bicycles, String placeWhereWriteSortedFile) {
        Collections.sort(bicycles, Comparator.comparing(bicycle -> bicycle.getClass().getName()));
        write(bicycles, placeWhereWriteSortedFile);
    }
}