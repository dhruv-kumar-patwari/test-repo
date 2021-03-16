package com.zemoso;

public class BusSolid extends Vehicle implements CanStartTrip, CanStartPrivateTrip{
    private String busNumber;
    private String driverName;
    private String conductorName;

    public BusSolid() {
    }

    public BusSolid(String busNumber, String driverName, String conductorName) {
        this.busNumber = busNumber;
        this.driverName = driverName;
        this.conductorName = conductorName;
    }
    public void startTrip(){
        System.out.println("Trip Started");
    }
    public void startPrivateTrip(){
        System.out.println("Private Trip Started");
    }
}
class Seller implements CanSellTickets, CanSellCandy{
    public void calculateFare(){
        System.out.println("Fare Calculated");
    }
    public void sellBottle(){
        System.out.println("Water bottle sold");
    }
    // Added functionality
    public void sellCandy(){
        System.out.println("Selling Candy");
    }
}
