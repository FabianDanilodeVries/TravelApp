package com.group2.MyTravelHistory.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class HolidayLocationVisit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long visitId;
    private String comment;
    private double rating;
    private Date datum;
    @ManyToOne
    @JoinColumn(name = "accommodation_id")
    private Accommodation accommodationId;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurantId;

    public HolidayLocationVisit( String comment, double rating, Date datum) {
        this.comment = comment;
        this.rating = rating;
        this.datum = datum;
    }

    public Accommodation getAccommodationId() {
        return accommodationId;
    }

    public void setAccommodationId(Accommodation accommodationId) {
        this.accommodationId = accommodationId;
    }

    public Restaurant getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Restaurant restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Long getVisitId() {
        return visitId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
}
