package com.pluralsight.finance;

public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    public void Asset(String name, double value) {
        this.name = name;
        this.marketValue = 0;
    }

    public String getName() {
        return name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    @Override
    public  double getValue(){
        return marketValue;
    }
}
