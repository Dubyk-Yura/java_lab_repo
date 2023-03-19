package ua.lviv.iot.algo.part1.lab1;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Bicycle {
    private static double priceIncrementUah = 10000;
    private String bikeType;
    private String bikeBrand;
    private double maxBikeSpeed;// max speed in m/s
    private double bikeCurrentSpeed;
    private static Bicycle instance;

    public static Bicycle getInstance() {
        if (instance == null) {
            return new Bicycle();
        }
        return instance;
    }

    public void accelerate(int speed) {
        var newSpeed = bikeCurrentSpeed + speed;
        if (newSpeed > maxBikeSpeed) {
            System.out.println("Speed with accelerate is more than maximum speed");
            return;
        }
        bikeCurrentSpeed = newSpeed;
        System.out.println("Current speed is changed and it equal to " + bikeCurrentSpeed);
    }

    public void brake() {
        bikeCurrentSpeed = 0;
        System.out.println("bike \"" + bikeBrand + "\" was stopped;");
    }

    public void increasePrice(double price) {
        price = priceIncrementUah + price;
        System.out.println("Price of bicycle after increase is " + price);
    }

    public static void main(String[] args) {
        var bicycles = new Bicycle[4];
        //Create with default constructor
        bicycles[0] = new Bicycle();
        //Create with all args constructor
        bicycles[1] = new Bicycle("mountain", "Kona", 40.0, 14.6);
        //create first object with instance
        bicycles[2] = getInstance();
        //create second object with instance
        bicycles[3] = getInstance();


        for (Bicycle bicycle : bicycles) {
            System.out.println(bicycle);
        }
    }
}

