package opg3.model;

public class Food extends Product {
    private int expiration;


    public Food(String name, int price, String description, int expiration, PriceTax priceTax) {
        super(name, price, description, priceTax);
        this.expiration = expiration;
    }
}
