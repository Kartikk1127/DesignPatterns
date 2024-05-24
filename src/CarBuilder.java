//Abstract builder
public interface CarBuilder {
    void buildTireType();
    void buildBodyType();
    void buildEngineType();
    Car getCar();
}
