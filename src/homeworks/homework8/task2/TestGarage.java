package homeworks.homework8.task2;

public class TestGarage {

    public static void main(String[] args) {

        Garage garage = new Garage();
        garage.parkTheCar(new SportCar("AUDI", "R8", 2020, "gasoline", 2000), 3);
        garage.parkTheCar(new Сrossover("BMW", "X6", 2021, "gasoline", 2200), 2);
        garage.parkTheCar(new Truck("Ford", "Cargo", 1996, "diesel", 3500), 1);
        garage.parkTheCar(new Minivan("Nissan", "Almera Tino", 2001, "diesel", 2100), 1);
        garage.parkTheCar(new SportCar("AUDI", "R8", 2020, "gasoline", 2000), 2);
        garage.leavingCarTheGarage(new SportCar("AUDI", "R8", 2020, "gasoline", 2000), 1);
        garage.printGarage();
        garage.theNumberOfThisCarInTheGarage(new SportCar("AUDI", "R8", 2020, "gasoline", 2000));

    }
}
