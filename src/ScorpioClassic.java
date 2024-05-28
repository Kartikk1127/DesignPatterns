//concrete implementation for scorpio classic
public class ScorpioClassic implements Scorpio{
    @Override
    public void showInfo() {
        System.out.println("Scorpio Classic");
    }

    @Override
    public Scorpio clone() throws CloneNotSupportedException {
        return (Scorpio) super.clone();
    }
}
