package com.group2.MyTravelHistory.Controller;

import com.group2.MyTravelHistory.Service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccommodationEndPoints {

    @Autowired
    AccommodationService accService;


}
