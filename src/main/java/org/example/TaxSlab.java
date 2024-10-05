package org.example;

public class TaxSlab {
    private double minRange;
    private double maxRange;
    private double taxRate;

    public TaxSlab(double minRange, double maxRange, double taxRate) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.taxRate = taxRate;
    }

    public TaxSlab(double minRange, double taxRate) {
        this.minRange = minRange;
        this.taxRate = taxRate;
    }

    public double getMinRange() {
        return minRange;
    }

    public double getMaxRange() {
        return maxRange;
    }

    public double getTaxRate() {
        return taxRate;
    }

}
