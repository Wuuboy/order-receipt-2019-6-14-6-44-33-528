package org.katas.refactoring;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private String customerAddress;
    private ArrayList<LineItem> lineItems;

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public ArrayList<LineItem> getLineItems() {
        return lineItems;
    }

    public Order(String customerName, String customerAddress) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public Order(ArrayList<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public Order(String customerName, String customerAddress, ArrayList<LineItem> lineItems) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.lineItems = lineItems;
    }
}
