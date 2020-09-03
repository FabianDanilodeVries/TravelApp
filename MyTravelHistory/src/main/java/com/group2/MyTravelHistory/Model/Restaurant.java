package com.group2.MyTravelHistory.Model;

import javax.persistence.*;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long restId;
    private String restaurantName;
    private String restaurantAddress;
    private String country;
    private Long ownerId;
    private double restaurantAverageRating;
    private int ratingCount;
    private String restaurantType;
    private int numberOfTables;
    private boolean vegetarianOptions;

    public Restaurant() {
    }

    public Restaurant(String restaurantName, String restaurantAddress, String country, Long ownerId, String restaurantType, int numberOfTables, boolean vegetarianOptions) {
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.country = country;
        this.ownerId = ownerId;
        this.restaurantAverageRating = 0.0;
        this.ratingCount = 0;
        this.restaurantType = restaurantType;
        this.numberOfTables = numberOfTables;
        this.vegetarianOptions = vegetarianOptions;
    }

    public Long getRestId() {
        return restId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
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

    public double getRestaurantAverageRating() {
        return restaurantAverageRating;
    }

    public void updateRestaurantAverageRating(double rating) {
        this.restaurantAverageRating = (((this.restaurantAverageRating*this.ratingCount)+rating)/(getRatingCount() + 1));
        updateRatingCount();
    }

    public int getRatingCount() {
        return ratingCount;
    }

    public void updateRatingCount(){
        this.ratingCount += 1;
    }

    public String getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    public int getNumberOfTables() {
        return numberOfTables;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public boolean isVegetarianOptions() {
        return vegetarianOptions;
    }

    public void setVegetarianOptions(boolean vegetarianOptions) {
        this.vegetarianOptions = vegetarianOptions;
    }
}