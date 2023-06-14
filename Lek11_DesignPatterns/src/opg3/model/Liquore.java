package opg3.model;

public class Liquore extends Product {
    private int alcoholPercentage;


    public Liquore(String name, int price, String description, int alcoholPercentage, PriceTax priceTax) {
        super(name, price, description, priceTax);
        this.alcoholPercentage = alcoholPercentage;
    }

    public int getAlcoholPercentage() {
        return alcoholPercentage;
    }
}
