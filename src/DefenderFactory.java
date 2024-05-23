public class DefenderFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new DefenderSmall();
    }

    @Override
    public SUV createSUV() {
        return new DefenderBig();
    }
}
