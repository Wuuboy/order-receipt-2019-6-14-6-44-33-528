package org.katas.refactoring;

public class LineItem {
    private String description;
    private double price;
    private int quantity;

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public LineItem(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalAmount() {
        return this.price*this.quantity;
    }
}