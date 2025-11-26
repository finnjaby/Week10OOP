package ie.atu;

public class PreferredCustomer extends Customer{
    private int loyaltyPoints;
    private double discountLevel;

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints) {     //parameterised constructor
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = updateDiscountLevel(loyaltyPoints);

    }
    public PreferredCustomer(){     //default constructor
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    private double updateDiscountLevel(int loyaltyPoints){      //discount level based on loyalty points
        if(loyaltyPoints <500){
            this.discountLevel = 0;
        }
        else if(loyaltyPoints < 1000){
            this.discountLevel = 0.05;
        }
        else if(loyaltyPoints < 1500){
            this.discountLevel = 0.06;
        }
        else if(loyaltyPoints < 2000){
            this.discountLevel = 0.07;
        }
        else if(loyaltyPoints >= 2000){
            this.discountLevel = 0.1;
        }
        return discountLevel;
    }

    //getters
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    public double getDiscountLevel() {
        return discountLevel;
    }

    //setters
    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel(loyaltyPoints);
    }
    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel(loyaltyPoints);
    }
    @Override
    public String toString() {      //format output
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';
    }

}
