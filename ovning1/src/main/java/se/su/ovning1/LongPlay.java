package se.su.ovning1;

public class LongPlay extends Recording {

    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    @Override
    public String getType() {
        return "LP";
    }

    @Override
    public double getPrice() {
        int currentYear = 2026; 
        int age = currentYear - getYear();
        
        double wearPrice = getOriginalPrice() * (getCondition() / 10.0);
        double totalPrice = wearPrice + (age * 5.0);
        
        return Math.max(totalPrice, 10.0);
    }
}