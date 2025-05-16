package com.pluralsight.roadVehicle;

public class RoadVehicle {
    private String dealerID;
    private String vin;
    private int year;
    private String make;
    private String model;
    private String type;
    private String color;
    private int odometer;
    private double originalPrice;
    private double mpg;
    private String trimPKG;
    private int passengerCap;
    private String awd4WD;
    private boolean luxury;
    private boolean offRoadCapable;

    public String toString() {
        return "";
    }

    @Override
    public String toString() {
        return "RoadVehicle{" +
                "dealerID='" + dealerID + '\'' +
                ", vin='" + vin + '\'' +
                ", year=" + year +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", odometer=" + odometer +
                ", originalPrice=" + originalPrice +
                ", mpg=" + mpg +
                ", trimPKG='" + trimPKG + '\'' +
                ", passengerCap=" + passengerCap +
                ", awd4WD='" + awd4WD + '\'' +
                ", luxury=" + luxury +
                ", offRoadCapable=" + offRoadCapable +
                '}';
    }
}
