package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public void Asset(String name, double value) {

    }

    public double getValue() {
        return marketValue;
    }
}
