package com.pluralsight.finance;

public abstract class Gold extends FixedAsset {
    private double weight;

    public Gold(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return weight;
    }


}
