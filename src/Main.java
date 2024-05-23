/*
In this example, CarFactory is the abstract factory interface that declares methods
for creating cars and SUVs. ScorpioFactory and DefenderFactory are concrete factory
classes that implement the CarFactory interface and create Scorpio or Defender
specific cars and SUVs.
The Main class uses a specific factory ( ScorpioFactory in this case) to create and
drive the car and SUV. This way, the client code is decoupled from the specific
classes of cars and SUVs, allowing for easy switching between different car and
SUV implementations.
*/

public class Main {
    private CarFactory factory;
    public Main(CarFactory factory){
        this.factory=factory;
    }

    public void driveCarAndSUV(){
        Car car = factory.createCar();
        SUV suv = factory.createSUV();

        car.drive();
        suv.drive();
    }
    public static void main(String[] args) {
        Main main = new Main(new ScorpioFactory());
        main.driveCarAndSUV();
    }
}