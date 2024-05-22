public class ScorpioClassFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new ScorpioClassic();
    }
}
