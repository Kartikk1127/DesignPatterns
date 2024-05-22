
/*The CarFactory class contains a static method createCar() that takes a String
parameter specifying the type of car to create. The method then uses a simple
conditional to determine which type of car to instantiate and return. This approach
encapsulates the creation logic in a single class method, making it a Simple
        Factory Method pattern.*/
public class CarFactory {
    public static Car createCar(String type){
        if ("ScorpioClassic".equalsIgnoreCase(type)){
            return new ScorpioClassic();
        }
        else if ("ScorpioN".equalsIgnoreCase(type)){
            return new ScorpioN();
        }
        else {
            throw new IllegalArgumentException("Invalid car type");
        }
    }
}
