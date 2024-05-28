/*In this example:
Scorpio is the prototype interface with methods showInfo() and clone() .
ScorpioClassic and ScorpioN are concrete implementations of the Scorpio
interface.
The PrototypeDemo class demonstrates how to use the Prototype pattern by
creating prototype instances ( prototype1 and prototype2 ), cloning them to
create new objects ( newScorpio1 and newScorpio2 ), and showing information
about the new objects.*/
public class Main {
    public static void main(String[] args) {
        try {
            //create prototype instances
            Scorpio prototype1 = new ScorpioClassic();
            Scorpio prototype2 = new ScorpioN();

            prototype1.showInfo();
            prototype2.showInfo();

            //clone prototypes to create new objects
            Scorpio newScorpio1 = prototype1.clone();
            Scorpio newScorpio2 = prototype2.clone();

            //show info of the new objects
            newScorpio1.showInfo();
            newScorpio2.showInfo();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
    }
}