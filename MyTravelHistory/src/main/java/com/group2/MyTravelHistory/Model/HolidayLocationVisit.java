package com.group2.MyTravelHistory.Model;

import java.util.Date;

public class HolidayLocationVisit {
    private HolidayLocation holidayLocation;
    private String comment;
    private double rating;
    private Date datum;

    public HolidayLocationVisit(HolidayLocation holidayLocation, String comment, double rating, Date datum) {
        this.holidayLocation = holidayLocation;
        this.comment = comment;
        this.rating = rating;
        this.datum = datum;
    }

    public HolidayLocation getHolidayLocation() {
        return holidayLocation;
    }

    public void setHolidayLocation(HolidayLocation holidayLocation) {
        this.holidayLocation = holidayLocation;
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
