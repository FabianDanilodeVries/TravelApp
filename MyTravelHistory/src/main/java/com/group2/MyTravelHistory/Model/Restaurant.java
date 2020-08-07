package com.group2.MyTravelHistory.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Restaurant extends HolidayLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String restaurantType;
    public int numberOfTables;
    public boolean VegetarianOptions;


    public Restaurant(String name, String address, Long ownerId, int averageRating, String restaurantType, int numberOfTables, boolean vegetarianOptions) {
        super(name, address, ownerId, averageRating);
        this.restaurantType = restaurantType;
        this.numberOfTables = numberOfTables;
        this.VegetarianOptions = vegetarianOptions;
    }

    public Long getId() {
        return id;
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
