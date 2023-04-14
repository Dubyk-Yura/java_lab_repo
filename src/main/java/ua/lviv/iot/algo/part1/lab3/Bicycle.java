package ua.lviv.iot.algo.part1.lab3;

import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.Getter;

import java.lang.reflect.Field;

@NoArgsConstructor
@ToString(callSuper = true)
@Getter
public class Bicycle extends AbstractBicycle {
    public static final String HEADERS = "bikeType";
    private String bikeType;

    @Override
    public float getMaxDistanceInKM() {
        return Integer.MAX_VALUE;
    }

    public String getHeaders() {
        return super.getHeaders() + ", " + HEADERS;
    }

    public String toCSV() {
        return super.toCSV() + ", " + getBikeType();
    }

    public Bicycle(final String bikeBrand, final int bikeMaxSpeedInMPH,
                   final int bikeCurrentSpeedInMPH, final String bikeType) {
        super(bikeBrand, bikeMaxSpeedInMPH, bikeCurrentSpeedInMPH);
        this.bikeType = bikeType;
    }

    public String getHeadersSmartly() {// треба дописати (проблема що бере публічне поле)(13 рядок )
        Class<? extends Bicycle> clazz = this.getClass();
        try{
            String result = "";
           Field[] fields = clazz.getFields();
            for (var field:fields) {
                result += field.getName();
            }
        }
        catch (Exception  e){ //виконується якщо в try виникли помилки
            e.printStackTrace();
        } finally {//виконується завжди

        }
        return null;

    }
}