package com.group2.MyTravelHistory.DAO;

import com.group2.MyTravelHistory.Model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface RestaurantDAO extends CrudRepository<Restaurant, Long> {

    Optional<Restaurant> getByRestaurantName(String restaurantName);
}
