package com.group2.MyTravelHistory.Dto;


import com.group2.MyTravelHistory.Model.Accommodation;

import java.util.List;

public class AccommodationByNameDto {

    private String accommodationName;
    private String accommodationAddress;


    public AccommodationByNameDto() {
    }

    public AccommodationByNameDto(String accommodationName, String accommodationAddress) {
        this.accommodationName = accommodationName;
        this.accommodationAddress = accommodationAddress;
    }

    public String getAccommodationName() {
        return accommodationName;
    }

    public void setAccommodationName(String accommodationName) {
        this.accommodationName = accommodationName;
    }

    public String getAccommodationAddress() {
        return accommodationAddress;
    }

    public void setAccommodationAddress(String accommodationAddress) {
        this.accommodationAddress = accommodationAddress;
    }
}