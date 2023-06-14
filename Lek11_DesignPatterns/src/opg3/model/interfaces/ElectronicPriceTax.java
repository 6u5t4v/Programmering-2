package opg3.model.interfaces;

import opg3.model.PriceTax;

public class ElectronicPriceTax implements PriceTax {
    private static final int TAX = 30;

    @Override
    public double calcPrice(double price) {
        if (price >= 3) {
            price *= 1 + (TAX / 100d);
        }

        return price;
    }
}
