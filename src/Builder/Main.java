package Builder;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        CarBuilder sportCar = new CarBuilder();
        ManualCarBuilder hyperCar = new ManualCarBuilder();

        director.makeSportCar(sportCar);
        Car car = sportCar.build();

        director.makeHyperCar(hyperCar);
        ManualCar manualCar = hyperCar.build();

        System.out.println("Sport Car");
        System.out.println(car);

        System.out.println();

        System.out.println("Hyper car");
        System.out.println(manualCar);
    }
}
