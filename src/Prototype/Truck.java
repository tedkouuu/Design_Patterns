package Prototype;

public class Truck extends Vehicle {
    private int capacity;

    public Truck() {
    }

    public Truck(Truck truck) {
        super(truck);
        this.capacity = truck.capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Truck clone() {
        return new Truck(this);
    }
}
