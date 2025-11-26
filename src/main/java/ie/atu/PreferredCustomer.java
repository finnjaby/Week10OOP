package ie.atu;

public class PreferredCustomer extends Customer{
    private int loyaltyPoints;
    private double discountLevel;

    public PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, int loyaltyPoints) {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = updateDiscountLevel(loyaltyPoints);

    }
    public PreferredCustomer(){
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }

    private double updateDiscountLevel(int loyaltyPoints){
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
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    public double getDiscountLevel() {
        return discountLevel;
    }
    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel(loyaltyPoints);
    }
    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel(loyaltyPoints);
    }
    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';
    }

}
