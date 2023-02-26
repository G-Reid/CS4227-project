package movierental;

public class Context {
    private Customer customer;
    private double discount;

    public Context(Customer customer){
        this.customer = customer;
    }

    public Customer getCustomer(){
        return customer;
    }

    public void setDiscount(double discount){
        this.discount = discount;
    }
}

