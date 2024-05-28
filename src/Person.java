public class Person implements Cloneable{
    private String name;
    private Address address;

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public Address getAddress(){
        return address;
    }

    @Override
    public Person clone(){
        try {
            //perform deep copy of the address object
            Address clonedAddress = this.address.clone();
            //create new person object with the cloned address
            return new Person(this.name,clonedAddress);
        } catch (CloneNotSupportedException e){
            return null;
        }
    }
}
