package com.kalpana.microservice.limitsservice.bean;

public class Limits {
    private int minimumLimit;
    private int maximumLimit;

    public Limits() {
    }

    public Limits(int minimumLimit, int maximumLimit) {
        this.minimumLimit = minimumLimit;
        this.maximumLimit = maximumLimit;
    }

    public int getMaximumLimit() {
        return maximumLimit;
    }

    public void setMaximumLimit(int maximumLimit) {
        this.maximumLimit = maximumLimit;
    }

    public int getMinimumLimit() {
        return minimumLimit;
    }

    public void setMinimumLimit(int minimumLimit) {
        this.minimumLimit = minimumLimit;
    }
}
