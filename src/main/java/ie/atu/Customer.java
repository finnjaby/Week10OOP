package ie.atu;

public class Customer extends Person{
    private int customerNumber;
    private boolean mailingList;

    public Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList) {     //parameterised constructor
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;

    }
    public Customer(){      //default constructor
        super();
        this.customerNumber = 0;
        this.mailingList = false;
    }

    //getters
    public int getCustomerNumber() {
        return customerNumber;
    }
    public boolean getMailingList() {
        return mailingList;
    }

    //setters
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }


    @Override
    public String toString() {      //format output
        return "Customer{" +
                "person=" + super.toString() +
                ", customerNumber=" + customerNumber +
                ", mailingList=" + mailingList +
                '}';
    }

}

