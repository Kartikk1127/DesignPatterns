// Concrete builder for Scorpio
public class ScorpioBuilder implements CarBuilder{

    private Car car;

    public ScorpioBuilder(String model){
        car = new Car(model);
    }
    @Override
    public void buildTireType() {
        car.setTireType("Off-road");
    }

    @Override
    public void buildBodyType() {
        car.setBodyType("SUV");
    }

    @Override
    public void buildEngineType() {
        car.setEngineType("Diesel");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
