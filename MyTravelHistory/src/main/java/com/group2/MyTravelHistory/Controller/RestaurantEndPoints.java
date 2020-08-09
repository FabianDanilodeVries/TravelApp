package com.group2.MyTravelHistory.Controller;

import com.group2.MyTravelHistory.Model.Restaurant;
import com.group2.MyTravelHistory.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantEndPoints {
    @Autowired
    RestaurantService resService;

    @GetMapping("/showAllRestaurants")
    public Iterable<Restaurant> showAllRestaurants(){
        return resService.getAllRestaurantsFromDAO();
    }

}
