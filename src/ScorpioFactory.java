public class ScorpioFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new ScorpioClassic();
    }

    @Override
    public SUV createSUV() {
        return new ScorpioN();
    }
}
