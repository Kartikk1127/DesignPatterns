public class ScorpioNFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new ScorpioN();
    }
}
