package opg3.model.interfaces;

import opg3.model.PriceTax;

public class OtherProductPriceTax implements PriceTax {
    private static final int TAX = 25;

    @Override
    public double calcPrice(double price) {
        return price * (1 + (TAX / 100d));
    }
}
