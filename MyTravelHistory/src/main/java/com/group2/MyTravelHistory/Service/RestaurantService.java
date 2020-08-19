package com.group2.MyTravelHistory.Service;

import com.group2.MyTravelHistory.DAO.RestaurantDAO;
import com.group2.MyTravelHistory.Model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RestaurantService {

    @Autowired
    RestaurantDAO resDAO;

    public Iterable<Restaurant> getAllRestaurantsFromDAO(){
        System.out.println("We got here");
        return resDAO.findAll();
    }

    public Optional<Restaurant> getByName(String restaurantName){

        return resDAO.getByRestaurantName(restaurantName);
    }


}
