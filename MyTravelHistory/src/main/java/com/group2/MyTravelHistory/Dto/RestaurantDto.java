package com.group2.MyTravelHistory.Dto;

public class RestaurantDto {

    private String restaurantName;
    private String restaurantAddress;
    private double restaurantAverageRating;
    private String restaurantType;
    private int numberOfTables;
    private boolean vegetarianOptions;


    public RestaurantDto() {
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

    public double getRestaurantAverageRating() {
        return restaurantAverageRating;
    }

    public void setRestaurantAverageRating(double restaurantAverageRating) {
        this.restaurantAverageRating = restaurantAverageRating;
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
