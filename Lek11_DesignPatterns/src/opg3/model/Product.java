package opg3.model;

public abstract class Product {
    private String name;
    private double price;
    private String description;
    private PriceTax priceStrategy;

    public Product(String name, double price, String description, PriceTax priceStrategy) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.priceStrategy = priceStrategy;
    }

    public double calcPrice() {
        return priceStrategy.calcPrice(price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
