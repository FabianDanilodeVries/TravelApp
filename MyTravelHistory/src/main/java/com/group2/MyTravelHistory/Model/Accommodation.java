package com.group2.MyTravelHistory.Model;

import javax.persistence.*;

@Entity
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accId;
    private String accommodationName;
    private String accommodationAddress;
    private String country;
    private Long ownerId;
    private double accommodationAverageRating;
    private int ratingCount;
    private String accommodationType;
    private int numberOfRooms;

    public Accommodation() {
    }
    public Accommodation(String accommodationName, String accommodationAddress, String country, Long ownerId, String accommodationType, int numberOfRooms) {
        this.accommodationName = accommodationName;
        this.accommodationAddress = accommodationAddress;
        this.country = country;
        this.ownerId = ownerId;
        this.accommodationAverageRating = 0;
        this.ratingCount = 0;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public double getAccommodationAverageRating() {
        return accommodationAverageRating;
    }

    public void updateAccommodationAverageRating(double rating) {
        this.accommodationAverageRating = (((this.accommodationAverageRating*this.ratingCount)+rating)/(this.ratingCount + 1));
        updateRatingCount();
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void updateRatingCount() {
        this.ratingCount +=1;
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