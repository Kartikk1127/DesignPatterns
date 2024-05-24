// Concrete builder for Fortuner
public class FortuneBuilder implements CarBuilder{

    private Car car;

    public FortuneBuilder(String model){
        car = new Car(model);
    }
    @Override
    public void buildTireType() {
        car.setTireType("All-terrain");
    }

    @Override
    public void buildBodyType() {
        car.setBodyType("SUV");
    }

    @Override
    public void buildEngineType() {
        car.setEngineType("Petrol");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
