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
    @JoinColumn(name="restId", nullable=false)
    private Restaurant restaurant;
    @ManyToOne
    @JoinColumn(name="accId", nullable=false)
    private Accommodation accommodation;

    public HolidayLocationVisit() {
    }

    public HolidayLocationVisit(String comment, double rating, Date datum) {
        this.comment = comment;
        this.rating = rating;
        this.datum = datum;
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
