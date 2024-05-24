//Create cars with different tyres, body and engine using Director and
//Builder


/*In this example, Car is the product class representing a car. CarBuilder is the
abstract builder interface with methods for building different parts of the car.
ScorpioBuilder and FortunerBuilder are concrete builders that implement the
CarBuilder interface to build Scorpio and Fortuner cars respectively.
CarManufacturer is the director class that orchestrates the construction process.
Finally, the client code demonstrates how to use the builder pattern to build
Scorpio and Fortuner cars with different configurations.*/
public class Main {
    public static void main(String[] args) {
        CarManufacturer carManufacturer = new CarManufacturer();

        CarBuilder scorpioBuilder = new ScorpioBuilder("Scorpio");
        Car scorpio = carManufacturer.buildCar(scorpioBuilder);
        scorpio.showCarDetails();

        System.out.println();

        CarBuilder fortunerBuilder = new FortuneBuilder("Fortuner");
        Car fortuner = carManufacturer.buildCar(fortunerBuilder);
        fortuner.showCarDetails();
    }
}