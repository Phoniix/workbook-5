package com.pluralsight.roadVehicle.personal;

import com.pluralsight.roadVehicle.RoadVehicle;

public class Convertible extends RoadVehicle {



    // Constructor ----------------------------------------------------------------------------------------------------
    public Convertible(String dealerID, String vin, int year, String make, String model, String type, String color, int odometer, double originalPrice) {
        super(dealerID, vin, year, make, model, type, color, odometer, originalPrice);
    }
}
