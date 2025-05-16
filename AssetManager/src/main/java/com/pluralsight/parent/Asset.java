package com.pluralsight.parent;

public class Asset {
    protected String description;
    protected String dateAcquired;
    protected double originalCost;

    protected Asset(String description, String dateAcquired, double originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }
    public String getDateAcquired() {
        return dateAcquired;
    }
    public double getValue() {
        return originalCost;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }
    public void setValue(double originalCost) {
        this.originalCost = originalCost;
    }
}
