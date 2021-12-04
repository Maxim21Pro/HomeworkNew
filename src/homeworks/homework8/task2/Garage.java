package homeworks.homework8.task2;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    public Garage() {
    }

    Map<Car, Integer> garage = new HashMap<Car, Integer>();

    public void parkTheCar(Car car, Integer numberOfCar) {
        if (garage.containsKey(car)) {
            garage.put(car, (garage.get(car) + numberOfCar));
        } else {
            garage.put(car, numberOfCar);
        }
    }

    public void leavingCarTheGarage(Car car, Integer numberOfCar) {
        if (garage.containsKey(car)) {
            garage.put(car, (garage.get(car) - numberOfCar));
        }
    }

    public void theNumberOfThisCarInTheGarage(Car car){
        System.out.println("Number:"+garage.get(car));
    }

    public void printGarage() {
        for (Map.Entry entry : garage.entrySet()) {
            System.out.println(entry);
        }
    }
}
