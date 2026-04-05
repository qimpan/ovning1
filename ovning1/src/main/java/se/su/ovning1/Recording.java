package se.su.ovning1;

public abstract class Recording extends Item implements PriceableWithVAT25{

    private String artist;
    private int year;
    private int condition;
    private double price;

    protected Recording(String name, String artist, int year, int condition, double price){
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    } 

    public String getArtist(){
        return artist;
    }
    
    public abstract String getType();

    public int getCondition(){
        return condition;
    }

    @Override
    public double getPrice(){
        double calculatedPrice = price * (condition / 10.0);
        return Math.max(calculatedPrice, 10.0);
    }
    
    @Override
    public String toString(){
        return getType() + " { name='" + getName() + "', artist='" + artist + "', year=" + year +
            ", condition=" + condition + ", original price=" + price +
            ", price=" + getPrice() + ", price+VAT=" + getPriceWithVAT() + " }";
    }

    public int getYear(){
        return year;
    }

    protected double getOriginalPrice(){
        return price;
    }

}
