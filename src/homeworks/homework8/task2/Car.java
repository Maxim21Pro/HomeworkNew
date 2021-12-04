package homeworks.homework8.task2;

public abstract class Car {

    protected String brandOfCar;
    protected String modelOfCar;
    protected int yearOfCar;
    protected String engineOfCar;
    protected int weightOfCar;

    protected Car(String brandOfCar, String modelOfCar, int yearOfCar, String engineOfCar, int weightOfCar) {
        this.brandOfCar = brandOfCar;
        this.modelOfCar = modelOfCar;
        this.yearOfCar = yearOfCar;
        this.engineOfCar = engineOfCar;
        this.weightOfCar = weightOfCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfCar != car.yearOfCar) return false;
        if (weightOfCar != car.weightOfCar) return false;
        if (brandOfCar != null ? !brandOfCar.equals(car.brandOfCar) : car.brandOfCar != null) return false;
        if (modelOfCar != null ? !modelOfCar.equals(car.modelOfCar) : car.modelOfCar != null) return false;
        return engineOfCar != null ? engineOfCar.equals(car.engineOfCar) : car.engineOfCar == null;
    }

    @Override
    public int hashCode() {
        int result = brandOfCar != null ? brandOfCar.hashCode() : 0;
        result = 31 * result + (modelOfCar != null ? modelOfCar.hashCode() : 0);
        result = 31 * result + yearOfCar;
        result = 31 * result + (engineOfCar != null ? engineOfCar.hashCode() : 0);
        result = 31 * result + weightOfCar;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandOfCar='" + brandOfCar + '\'' +
                ", modelOfCar='" + modelOfCar + '\'' +
                ", yearOfCar=" + yearOfCar +
                ", engineOfCar='" + engineOfCar + '\'' +
                ", weightOfCar=" + weightOfCar +
                '}';
    }
}
