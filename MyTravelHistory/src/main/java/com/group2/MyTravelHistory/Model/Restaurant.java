package com.group2.MyTravelHistory.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String country;
    private String name;
    private String address;
    private Long ownerId;
    private int averageRating;
    private String restaurantType;
    private int numberOfTables;
    private boolean VegetarianOptions;

    public Restaurant(String country, String name, String address, Long ownerId, int averageRating, String restaurantType, int numberOfTables, boolean vegetarianOptions) {
        this.country = country;                 this.name = name;                       this.address = address;                 this.ownerId = ownerId;
        this.averageRating = averageRating;     this.restaurantType = restaurantType;   this.numberOfTables = numberOfTables;   this.VegetarianOptions = vegetarianOptions;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public int getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
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
        return VegetarianOptions;
    }

    public void setVegetarianOptions(boolean vegetarianOptions) {
        VegetarianOptions = vegetarianOptions;
    }
}
