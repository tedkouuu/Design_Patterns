package Builder;

public class Director {
    private Builder builder;

    // Here we create object before get call.
    public void makeSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("Petrol");
        builder.setGPS();
    }

    // Here we got empty object which we should init in client side.
    public void makeHyperCar(Builder builder) {
    }
}
