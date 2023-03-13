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
        Bicycle[] bike = new Bicycle[4];
        Bicycle b = new Bicycle();

        //Create with default constructor
        bike[0] = new Bicycle();

        //Create with all args constructor
        bike[1] = new Bicycle("mountain", "Kona", 40.0, 14.6);
        //create first object with instance
        bike[2] = getInstance();
        //create second object with instance
        bike[3] = getInstance();


        for (Bicycle i:bike ) {
            System.out.println(i);
        }
    }
}

