package com.pluralsight.finance;

public class Jewelry implements Valuable{
    private double karat;

    public Jewelry(String name, double karat) {

    }

    public double getValue() {
        return karat;
    }
}
