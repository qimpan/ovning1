package se.su.ovning1;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private static int orderCounter = 0;
    private int orderId;
    private List<Item> items;

    public Order(Item... items) {
        orderCounter++;
        this.orderId = orderCounter;
        this.items = new ArrayList<>();
        for (Item item : items) {
            this.items.add(item);
        }
    }

    public double getTotalValue() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public double getTotalValuePlusVAT() {
        double total = 0;
        for (Item item : items) {
            total += item.getPriceWithVAT();
        }
        return total;
    }

    public String getReceipt() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Receipt for order #").append(orderId).append("\n");
        sb.append("-----------\n");
        
        for (Item item : items) {
            sb.append(item.toString()).append("\n");
        }
        
        sb.append("Total excl. VAT: ").append(getTotalValue()).append("\n");
        sb.append("Total incl. VAT: ").append(getTotalValuePlusVAT()).append("\n");
        sb.append("-----------");
        
        return sb.toString();
    }
}