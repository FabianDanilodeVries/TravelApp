package com.group2.MyTravelHistory.Model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class HolidayLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    protected  String name;
    protected  String address;
    protected Long ownerId;
    protected double averageRating;

    public HolidayLocation(String name, String address, Long ownerId, int averageRating) {

        this.name = name;
        this.address = address;
        this.ownerId = ownerId;
        this.averageRating = averageRating;
    }

    public HolidayLocation() {

    }

    public Long getId() {
        return id;
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
}
