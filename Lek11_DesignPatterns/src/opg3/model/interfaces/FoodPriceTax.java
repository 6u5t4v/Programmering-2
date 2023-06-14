package opg3.model.interfaces;

import opg3.model.PriceTax;

public class FoodPriceTax implements PriceTax {
    private static int TAX = 5;

    @Override
    public double calcPrice(double price) {
        return price * 1 + (TAX / 100d);
    }
}
