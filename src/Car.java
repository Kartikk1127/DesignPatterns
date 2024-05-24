//product class
public class Car {
    private String model;
    private String tireType;
    private String bodyType;
    private String engineType;

    public Car(String model){
        this.model = model;
    }

    public void setTireType(String tireType){
        this.tireType = tireType;
    }

    public void setBodyType(String bodyType){
        this.bodyType = bodyType;
    }

    public void setEngineType(String engineType){
        this.engineType = engineType;
    }

    public void showCarDetails(){
        System.out.println("Model: " + model);
        System.out.println("Tire Type: " + tireType);
        System.out.println("Body Type: " + bodyType);
        System.out.println("Engine Type: " + engineType);
    }
}
