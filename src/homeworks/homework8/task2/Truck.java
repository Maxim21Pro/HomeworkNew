package homeworks.homework8.task2;

public class Truck extends Car{

    public Truck(String brandOfCar, String modelOfCar, int yearOfCar, String engineOfCar, int weightOfCar) {
        super(brandOfCar, modelOfCar, yearOfCar, engineOfCar, weightOfCar);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
