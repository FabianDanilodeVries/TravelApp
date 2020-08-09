package com.group2.MyTravelHistory.Model;

import javax.persistence.Entity;

@Entity
public class Restaurant extends HolidayLocation {

    public String restaurantType;
    public int numberOfTables;
    public boolean vegetarianOptions;

    public Restaurant(){
        super();

    }
    public Restaurant(String name, String address, Long ownerId, int averageRating, String restaurantType, int numberOfTables, boolean vegetarianOptions) {
        super(name, address, ownerId, averageRating);
        this.restaurantType = restaurantType;
        this.numberOfTables = numberOfTables;
        this.vegetarianOptions = vegetarianOptions;
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

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(int averageRating) {
        this.averageRating = averageRating;
    }

    public String getRestaurantType() {
        return this.restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }

    public int getNumberOfTables() {
        return this.numberOfTables;
    }

    public void setNumberOfTables(int numberOfTables) {
        this.numberOfTables = numberOfTables;
    }

    public boolean isVegetarianOptions() {
        return this.vegetarianOptions;
    }

    public void setVegetarianOptions(boolean vegetarianOptions) {
        this.vegetarianOptions = vegetarianOptions;
    }
}
