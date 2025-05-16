package com.pluralsight.children;

import com.pluralsight.parent.Asset;

public class House extends Asset {

    protected String address;
    protected int condition;
    protected int squareFootage;
    protected int lotSize;

    protected House(String description, String dateAcquired, double originalCost, int squareFootage, String address, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.squareFootage = squareFootage;
        this.address = address;
        this.condition = getCondition();
        this.lotSize = lotSize;
    }

    public int getCondition () {
        if ((this.originalCost / this.squareFootage) + (.25 * this.lotSize) > 180) return 1;
        if ((this.originalCost / this.squareFootage) + (.25 * this.lotSize) > 130) return 2;
        if ((this.originalCost / this.squareFootage) + (.25 * this.lotSize) > 90) return 3;
        if ((this.originalCost / this.squareFootage) + (.25 * this.lotSize) > 80) return 4;
        return 4;
    }

}
