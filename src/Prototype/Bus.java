package Prototype;

public class Bus extends Vehicle {
    private int wheels;

    public Bus() {
    }

    public Bus(Bus bus) {
        super(bus);
        this.wheels = bus.wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public Bus clone() {
        return new Bus(this);
    }
}
