package com.group2.MyTravelHistory.Model;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Accommodation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long accId;
    private String name;
    private String address;
    private Long ownerId;
    private double averageRating;
    private String accommodationType;
    private int numberOfRooms;
    @OneToMany(mappedBy = "accommodation")
    private Set<Accommodation> accommodation;

    public Accommodation() {
    }

    public Accommodation(String name, String address, Long ownerId, double averageRating, String accommodationType, int numberOfRooms) {
        this.name = name;
        this.address = address;
        this.ownerId = ownerId;
        this.averageRating = averageRating;
        this.accommodationType = accommodationType;
        this.numberOfRooms = numberOfRooms;
    }

    public Long getAccId() {
        return accId;
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

    public Set<Accommodation> getAccommodations() {
        return accommodation;
    }

    public void setAccommodations(Set<Accommodation> accommodation) {
        this.accommodation = accommodation;
    }
}