package com.group2.MyTravelHistory.Model;

import javax.persistence.*;

@Entity
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accId;
    private String accommodationName;
    private String accommodationAddress;
    private Long ownerId;
    private double averageRating;
    private String accommodationType;
    private int numberOfRooms;

    public Accommodation() {
    }
    public Accommodation(String accommodationName, String accommodationAddress, Long ownerId, double averageRating, String accommodationType, int numberOfRooms) {
        this.accommodationName = accommodationName;
        this.accommodationAddress = accommodationAddress;
        this.ownerId = ownerId;
        this.averageRating = averageRating;
        this.accommodationType = accommodationType;
        this.numberOfRooms = numberOfRooms;
    }

    public Long getAccId() {
        return accId;
    }

    public String getAccommodationName() {
        return accommodationName;
    }

    public void setAccommodationName(String accommodationName) {
        this.accommodationName = accommodationName;
    }

    public String getAccommodationAddress() {
        return accommodationAddress;
    }

    public void setAccommodationAddress(String accommodationAddress) {
        this.accommodationAddress = accommodationAddress;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public String getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(String accommodationType) {
        this.accommodationType = accommodationType;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}