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
    @JoinColumn(foreignKey = @ForeignKey(name = "restId"))
    private Restaurant restaurant;
    @ManyToOne
    @JoinColumn(foreignKey = @ForeignKey(name = "accId"))
    private Accommodation accommodation;
    @JoinColumn(foreignKey = @ForeignKey(name = "userId"))
    @ManyToOne
    private User user;
    private String visitType;

    public HolidayLocationVisit() {
    }

    public HolidayLocationVisit(String comment, double rating, Date datum, String visitType) {
        this.comment = comment;
        this.rating = rating;
        this.datum = datum;
        this.visitType = visitType;
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

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }
}
