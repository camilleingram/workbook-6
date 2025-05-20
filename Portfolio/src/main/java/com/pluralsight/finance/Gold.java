package com.pluralsight.finance;

public class Gold implements Valuable{
    private double weight;

    public Gold(double weight) {
        this.weight = weight;
    }

    public double getValue() {
        return weight;
    }
}
