public class Main {
    public static void main(String[] args) {
        Car scorpioClassic = CarFactory.createCar("ScorpioClassic");
        scorpioClassic.drive();

        Car scorpioN = CarFactory.createCar("ScorpioN");
        scorpioN.drive();
    }
}