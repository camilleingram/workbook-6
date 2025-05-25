package com.pluralsight.finance;

public abstract class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double karat) {

    }

    @Override
    public double getValue() {
        return karat;
    }
}
