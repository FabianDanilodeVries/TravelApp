package com.group2.MyTravelHistory.Dto;


public class AccommodationByNameDto {

    private String accommodationName;


    public AccommodationByNameDto() {
    }

    public AccommodationByNameDto(String accommodationName) {
        this.accommodationName = accommodationName;
    }

    public String getAccommodationName() {
        return accommodationName;
    }

    public void setAccommodationName(String accommodationName) {
        this.accommodationName = accommodationName;
    }
}

