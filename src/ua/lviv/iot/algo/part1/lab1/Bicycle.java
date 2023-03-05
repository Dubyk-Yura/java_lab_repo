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
    private static final double priceBike = 10000; //price in UAH
    private String type;
    private String brand;
    private double maxSpeed;// max speed in m/s
    private double currentSpeed;
    private static Bicycle instance;


    public static Bicycle getInstance() {
        if (instance == null) {
            return new Bicycle();
        }
        return instance;
    }

    public void accelerate(int speed) {
        var newSpeed = currentSpeed + speed;
        if (newSpeed > maxSpeed) {
            System.out.println("Speed with accelerate is more than maximum speed");
            return;
        }
        currentSpeed = newSpeed;
        System.out.println("Current speed is changed and it equal to " + currentSpeed);
    }

    public void brake() {
        currentSpeed = 0;
        System.out.println("bike \"" + brand + "\" was stopped;");
    }

    public void increasePrice(double price) {
        price = priceBike + price;
        System.out.println("Price of bicycle after increase is " + price);
    }


    public static void main(String[] args) {
        Bicycle[] bike = new Bicycle[4];

        //Create with default constructor
        bike[0] = new Bicycle();

        //Create with all args constructor
        bike[1] = new Bicycle("mountain", "Kona", 40.0, 14.6);

        //create first object with instance
        bike[2] = getInstance();
        bike[2].setBrand("Ride1Up");
        bike[2].setCurrentSpeed(16.2);
        bike[2].setMaxSpeed(50);
        bike[2].setType("Roads");


        //create second object with instance
        bike[3] = getInstance();
        bike[3].setBrand("Marin Bikes");
        bike[3].setCurrentSpeed(19.2);
        bike[3].setMaxSpeed(45);
        bike[3].setType("Roads");

        for (int idx = 0; idx < bike.length; idx++) {
            System.out.println("Bike " + (idx + 1) + ": " + bike[idx].toString() + ";");
        }
        bike[3].accelerate(10);
    }
}

