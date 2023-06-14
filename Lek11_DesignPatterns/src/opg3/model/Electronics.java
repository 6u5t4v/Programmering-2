package opg3.model;

public class Electronics extends Product {

    private int energiEfficiency;


    public Electronics(String name, int price, String description, int energiEfficiency, PriceTax priceStrategy) {
        super(name, price, description, priceStrategy);
        this.energiEfficiency = energiEfficiency;
    }

    public int getEnergiEfficiency() {
        return energiEfficiency;
    }
}
