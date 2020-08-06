package com.group2.MyTravelHistory.Model;


public abstract class HolidayLocation {

    public String name;
    public String address;
    public Long ownerId;
    public int averageRating;

    public HolidayLocation(String name, String address, Long ownerId, int averageRating) {
        this.name = name;
        this.address = address;
        this.ownerId = ownerId;
        this.averageRating = averageRating;
    }

    public HolidayLocation() {}

}
