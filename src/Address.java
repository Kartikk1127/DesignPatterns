public class Address implements Cloneable{
    private String street;
    private String city;

    public Address(String street, String city){
        this.street = street;
        this.city = city;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){
        return city;
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }

    public void setStreet(String city) {
        this.street=city;
    }
}
