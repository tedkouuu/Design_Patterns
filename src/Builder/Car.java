package Builder;

public class Car {
    private int seats;
    private String engine;
    private boolean GPS;

    public Car() {
    }

    public Car(int seats, String engine, boolean GPS) {
        this.seats = seats;
        this.engine = engine;
        this.GPS = GPS;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public boolean isGPS() {
        return GPS;
    }

    public void setGPS(boolean GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return String.format("Seats: %d / Engine: %s / GPS: %s", this.seats, this.engine, this.GPS);
    }
}
