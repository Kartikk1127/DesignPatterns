//concrete implementation for scorpio N
public class ScorpioN implements Scorpio{
    @Override
    public void showInfo() {
        System.out.println("Scorpio N");
    }

    @Override
    public Scorpio clone() throws CloneNotSupportedException {
        return (Scorpio) super.clone();
    }
}
