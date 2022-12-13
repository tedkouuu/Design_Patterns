package Prototype;

public class Car extends Vehicle {
    private int topSpeed;

    public Car() {
    }

    public Car(Car car) {
        super(car);
        this.topSpeed = car.topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }
}
