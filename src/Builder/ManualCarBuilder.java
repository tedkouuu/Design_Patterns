package Builder;

public class ManualCarBuilder implements Builder{
    private ManualCar manualCar;

    public ManualCarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manualCar = new ManualCar();
    }

    @Override
    public void setSeats(int number) {
        this.manualCar.setSeats(number);
    }

    @Override
    public void setEngine(String engine) {
        this.manualCar.setEngine(engine);
    }

    @Override
    public void setGPS() {
        this.manualCar.setGPS(false);
    }

    public ManualCar build() {
        return this.manualCar;
    }

}
