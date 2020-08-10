package com.group2.MyTravelHistory.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;


@Entity
public class Accommodation extends HolidayLocation {

    private String accommodationType;
    private int numberOfRooms;

    @OneToMany(mappedBy = "accommodationId")
    @JsonBackReference
    private Set<HolidayLocationVisit> holidayLocationVisit;

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
