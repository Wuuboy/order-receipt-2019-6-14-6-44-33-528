package org.katas.refactoring;

import java.util.List;

public class Order {
    private String name;
    private String address;
    private List<LineItem> lineItems;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public Order(String name, String address, List<LineItem> lineItems) {
        this.name = name;
        this.address = address;
        this.lineItems = lineItems;
    }
}
