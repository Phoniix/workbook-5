package com.pluralsight.roadVehicle.personal;

import com.pluralsight.roadVehicle.RoadVehicle;

public class CargoVan extends RoadVehicle {



    // Constructor ----------------------------------------------------------------------------------------------------
    public CargoVan(String dealerID, String vin, int year, String make, String model, String type, String color, int odometer, double originalPrice) {
        super(dealerID, vin, year, make, model, type, color, odometer, originalPrice);
    }
}
