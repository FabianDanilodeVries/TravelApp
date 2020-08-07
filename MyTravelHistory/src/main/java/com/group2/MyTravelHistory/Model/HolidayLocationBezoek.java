package com.group2.MyTravelHistory.Model;

import java.time.LocalDateTime;

public class HolidayLocationBezoek {
    HolidayLocation hl;
    String comment;
    double rating;
    LocalDateTime datum;

    public HolidayLocationBezoek(HolidayLocation hl, String comment, double rating, LocalDateTime datum) {
        this.hl = hl;
        this.comment = comment;
        this.rating = rating;
        this.datum = datum;
    }

    public HolidayLocation getHl() {
        return hl;
    }

    public void setHl(HolidayLocation hl) {
        this.hl = hl;
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

    public LocalDateTime getDatum() {
        return datum;
    }

    public void setDatum(LocalDateTime datum) {
        this.datum = datum;
    }
}
