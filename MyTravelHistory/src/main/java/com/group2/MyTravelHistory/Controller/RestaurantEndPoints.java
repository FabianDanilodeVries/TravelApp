package com.group2.MyTravelHistory.Controller;

import com.group2.MyTravelHistory.Dto.RestaurantDto;
import com.group2.MyTravelHistory.Model.Restaurant;
import com.group2.MyTravelHistory.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RestaurantEndPoints {
    @Autowired
    RestaurantService resService;

    @GetMapping("Restaurant/ShowAllRestaurants")
    public Iterable<Restaurant> showAllRestaurants(){
        return resService.getAllRestaurantsFromDAO();
    }

    @GetMapping("Restaurant/GetByName/{restaurantName}")
    public RestaurantDto getByName(@PathVariable("restaurantName") String restaurantName) {
        Optional<Restaurant> restaurantOptional = this.resService.getByName(restaurantName);
        Restaurant r = restaurantOptional.get();
        RestaurantDto restaurantDTO = new RestaurantDto();
        restaurantDTO.setRestaurantName(r.getRestaurantName());
        restaurantDTO.setRestaurantType(r.getRestaurantType());
        restaurantDTO.setRestaurantAddress(r.getRestaurantAddress());
        restaurantDTO.setRestaurantAverageRating(r.getRestaurantAverageRating());
        restaurantDTO.setVegetarianOptions(r.isVegetarianOptions());
        restaurantDTO.setNumberOfTables(r.getNumberOfTables());
        return restaurantDTO;
    }



}
