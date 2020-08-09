package com.group2.MyTravelHistory.DAO;

import com.group2.MyTravelHistory.Model.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface RestaurantDAO extends CrudRepository<Restaurant, Long> {
}
