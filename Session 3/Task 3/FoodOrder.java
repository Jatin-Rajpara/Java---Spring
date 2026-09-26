package com.jatin;

public class FoodOrder {

    private int orderId;
    private DeliveryDetails dd;

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setDeliveryDetails(DeliveryDetails dd) {
        this.dd = dd;
    }

    public void showOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Address: " + dd.getAddress());
    }
}