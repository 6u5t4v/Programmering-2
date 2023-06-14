package opg3.model.interfaces;

import opg3.model.PriceTax;

public class LiquorePriceTax implements PriceTax {
    @Override
    public double calcPrice(double price) {
        if (price > 90) {
            price *= 1 + (120 / 100d);
        } else {
            price *= 1 + (80 / 100d);
        }

        return price;
    }
}
