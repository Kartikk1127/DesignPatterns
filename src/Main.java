/*In this example, CarFactory is the factory class with the createCar() method, which
is responsible for creating Car objects. ScorpioClassicFactory and ScorpioNFactory are
subclasses of CarFactory that override the createCar() method to return
ScorpioClassic and ScorpioN objects respectively*/
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