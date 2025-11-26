package ie.atu;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;

    public Person(String name, String address, String phoneNumber) { //parameterised constructor
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    public Person(){        //default constructor
        this.name = "Not set";
        this.address = "Not set";
        this.phoneNumber = "Not set";
    }

    //getters
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    @Override       //format output
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

}
