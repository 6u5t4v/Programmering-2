package opg3;

import opg3.model.*;
import opg3.model.interfaces.ElectronicPriceTax;
import opg3.model.interfaces.FoodPriceTax;
import opg3.model.interfaces.LiquorePriceTax;
import opg3.model.interfaces.OtherProductPriceTax;

public class App {
    public static void main(String[] args) {
        FoodPriceTax foodPriceTax = new FoodPriceTax();
        ElectronicPriceTax electronicPriceTax = new ElectronicPriceTax();
        LiquorePriceTax liquorePriceTax = new LiquorePriceTax();
        OtherProductPriceTax otherProductPriceTax = new OtherProductPriceTax();

        Product apple = new Food("Apple", 5, "very delicious", 10, foodPriceTax);
        Product bread = new Food("Bread", 16, "dat gud", 9, foodPriceTax);
        Product orange = new Food("Orange", 3, "dat bitch juicy af", 12, foodPriceTax);
        Product macbook = new Electronics("Macbook", 10499, "very modern", 70, electronicPriceTax);
        Product vacuum = new Electronics("Vacuum", 2600, "sucking good", 120, electronicPriceTax);
        Product gin = new Liquore("Gin", 89, "good med tonic", 45, liquorePriceTax);
        Product vodka = new Liquore("Vodka", 150, ":O", 70, liquorePriceTax);
        Product rom = new Liquore("Rom", 90, "god med cola", 65, liquorePriceTax);
        Product toiletpaper = new OtherProduct("Toiletpaper", 30, "god til røven", otherProductPriceTax);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(apple);
        cart.addProduct(bread);
        cart.addProduct(orange);
        cart.addProduct(macbook);
        cart.addProduct(vacuum);
        cart.addProduct(gin);
        cart.addProduct(vodka);
        cart.addProduct(rom);
        cart.addProduct(toiletpaper);

        System.out.println(cart.totalPrice());
    }
}
