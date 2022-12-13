package Prototype;

public class TestCloning {

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Porsche");
        car.setModel("911 Turbo");
        car.setTopSpeed(320);

        Car clone = car.clone();

        System.out.printf("%s / %s / %d km", clone.getBrand(), clone.getModel(), clone.getTopSpeed());

        // Result: Porsche / 911 Turbo / 320 km
    }
}