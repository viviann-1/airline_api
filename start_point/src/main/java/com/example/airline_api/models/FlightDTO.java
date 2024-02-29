package com.example.airline_api.models;

import java.util.List;

public class FlightDTO {
    private String destinationId;
    private int capacity;
    private String departureDate;
    private String departureTime;
    private List<Long> passengerId;

    public FlightDTO(String destinationId, int capacity, String departureDate, String departureTime, List<Long> passengerId){
        this.destinationId = destinationId;
        this.capacity = capacity;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.passengerId = passengerId;
    }
    public FlightDTO(){}

    //Getters and Setters
    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public List<Long> getPassengerId() {return passengerId;}

    public void setPassengerId(){ this.passengerId = passengerId;
    }

    public void setPassengerId(List<Long> passengerId) {
        this.passengerId = passengerId;
    }

}
