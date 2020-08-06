package com.group2.MyTravelHistory.Model;

public class Accommodation extends HolidayLocation {
    String accommodationType;
    int numberOfRooms;

    public Accommodation(String name, String address, Long ownerId, int averageRating, String accommodationType, int numberOfRooms) {
        super(name, address, ownerId, averageRating);
        this.accommodationType = accommodationType;
        this.numberOfRooms = numberOfRooms;
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
