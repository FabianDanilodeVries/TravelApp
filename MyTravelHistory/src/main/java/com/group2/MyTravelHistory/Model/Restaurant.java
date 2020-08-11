package com.group2.MyTravelHistory.Model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long restId;
    private String name;
    private String address;
    private Long ownerId;
    private double averageRating;
    private String restaurantType;
    private int numberOfTables;
    private boolean vegetarianOptions;
    @OneToMany(mappedBy = "restaurant")
    private Set<Restaurant> restaurant;

    public Restaurant() {
    }

    public Restaurant(String name, String address, Long ownerId, double averageRating, String restaurantType, int numberOfTables, boolean vegetarianOptions) {
        this.name = name;
        this.address = address;
        this.ownerId = ownerId;
        this.averageRating = averageRating;
        this.restaurantType = restaurantType;
        this.numberOfTables = numberOfTables;
        this.vegetarianOptions = vegetarianOptions;
    }

    public Long getRestId() {
        return restId;
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

    public void setAverageRating(double averageRating) {
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
        return vegetarianOptions;
    }

    public void setVegetarianOptions(boolean vegetarianOptions) {
        this.vegetarianOptions = vegetarianOptions;
    }

    public Set<Restaurant> getRestaurants() {
        return restaurant;
    }

    public void setRestaurants(Set<Restaurant> restaurant) {
        this.restaurant = restaurant;
    }
}