package com.zemoso;

public class BusNotSolid {
    private String busNumber;
    private String driverName;
    private String conductorName;

    public BusNotSolid(String busNumber, String driverName, String conductorName) {
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.conductorName = conductorName;
    }

    public BusNotSolid() {
    }

    public void startTrip(){
        System.out.println("Trip Started");
    }
    public void calculateFare(){
        System.out.println("Fare calculated here");
    }
    public void sellWaterBottles(){
        System.out.println("Bottles sold here");
    }
    public void startPrivateTrip(){
        System.out.println("Private Trip started");
    }
}
