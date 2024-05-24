// Director class
public class CarManufacturer {
    public Car buildCar(CarBuilder carBuilder){
        carBuilder.buildTireType();
        carBuilder.buildBodyType();
        carBuilder.buildEngineType();
        return carBuilder.getCar();
    }
}
