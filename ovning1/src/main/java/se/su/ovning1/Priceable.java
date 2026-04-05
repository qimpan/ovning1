package se.su.ovning1;

public interface Priceable {
    double getPrice();
    double getVAT();
    
    default double getPriceWithVAT() {
        return getPrice() * (1 + getVAT());
    }

    interface PriceableWithVAT6 extends Priceable {
        @Override
        default double getVAT() {
            return 0.06;
        }
    }
    
    interface PriceableWithVAT25 extends Priceable {
        @Override
        default double getVAT() {
            return 0.25;
        }
    }
}
