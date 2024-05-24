//Create cars with different tyres, body and engine using Director and
//Builder
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