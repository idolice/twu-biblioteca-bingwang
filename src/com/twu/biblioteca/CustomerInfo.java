package com.twu.biblioteca;

/**
 * Created by bingwang on 3/2/17.
 */
public class CustomerInfo {
    private int stage;
    private Customer customer;

    public CustomerInfo(int stage, Customer customer) {
        this.stage = stage;
        this.customer = customer;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
