public class Main {
    public static void main(String[] args) {
        CarFactory classicFactory = new ScorpioClassFactory();
        Car scorpioClassic = classicFactory.createCar();
        scorpioClassic.drive();

        CarFactory nFactory = new ScorpioNFactory();
        Car scorpioN = nFactory.createCar();
        scorpioN.drive();
    }
}