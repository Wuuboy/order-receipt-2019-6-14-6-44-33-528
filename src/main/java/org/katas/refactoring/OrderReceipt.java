package org.katas.refactoring;

import java.util.ArrayList;

public class OrderReceipt {
    private Order order;

    public OrderReceipt(Order order) {
        this.order = order;
    }

    final ArrayList<LineItem> lineItems = order.getLineItems();

    final double salesTax = lineItems.stream().mapToDouble(e -> {
        return e.getTotalAmount()*0.10;
    }).sum();

    final double totalAmount = lineItems.stream().mapToDouble(e -> {
        return e.getTotalAmount()*0.10;
    }).sum();

    public String[] printLineItemAndSalesTax() {
        String[] outputArray = new String[order.getLineItems().size()+2];
        double totalSalesTax = 0d;
        double totalAmount = 0d;
        ArrayList<LineItem> lineItems = order.getLineItems();
        for (int i = 0;i<order.getLineItems().size();i++) {
            outputArray[i] = String.format("%s\t%.1f\t%d\t%.1f\n",lineItems.get(i).getDescription(),lineItems.get(i).getPrice(),lineItems.get(i).getQuantity(),lineItems.get(i).getTotalAmount());
            double salesTax = caculateSalesTax(lineItems.get(i).getTotalAmount() , 0.10);
            totalSalesTax += salesTax;
            totalAmount += lineItems.get(i).getTotalAmount() + salesTax;
        }
        outputArray[order.getLineItems().size()] = String.format("Sales Tax\t%.1f",totalSalesTax);
        outputArray[order.getLineItems().size()+1] = String.format("Total Amount\t%.1f",totalAmount);
        return outputArray;
    }

//    public String appendLineItems(ArrayList<LineItem> lineItems){
//        String[] outputArray = new String[order.getLineItems().size()+2];
//        double totalSalesTax = 0d;
//        double totalAmount = 0d;
//        for (int i = 0;i<order.getLineItems().size();i++) {
//            outputArray[i] = String.format("%s\t%.1f\t%d\t%.1f\n",lineItems.get(i).getDescription(),lineItems.get(i).getPrice(),lineItems.get(i).getQuantity(),lineItems.get(i).getTotalAmount());
//            double salesTax = caculateSsalesTax(lineItems.get(i).getTotalAmount() , 0.10);
//            totalSalesTax += salesTax;
//            totalAmount += lineItems.get(i).getTotalAmount() + salesTax;
//        }
//    }

    public double caculateSalesTax(double totalAmount,double rate){
        return totalAmount*rate;
    }

    public String printCustomerInformation() {
        String output = String.format("======Printing Orders====== %s%s",order.getCustomerName(),order.getCustomerAddress());
        return output;
    }
}