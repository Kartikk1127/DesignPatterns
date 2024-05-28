//deep copy example
/*In this example, the Address class implements the Cloneable interface and overrides
the clone() method to perform a shallow copy of the Address object. The Person
class also implements the Cloneable interface and overrides the clone() method to
perform a deep copy of the Address object when cloning a Person object.*/
public class Main {
    public static void main(String[] args) {
        Address address = new Address("Nala sopara","Mumbai");
        Person person1 = new Person("Kartik",address);

        //performing deep copy
        Person person2 = person1.clone();

        //modify the original address object
        address.setStreet("Andheri");

        System.out.println("Person 1 address: " + person1.getAddress().getStreet());
        System.out.println("Person 2 address: " + person2.getAddress().getStreet());

    }
}