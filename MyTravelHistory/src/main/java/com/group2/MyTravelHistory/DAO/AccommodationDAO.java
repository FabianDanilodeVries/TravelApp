package com.group2.MyTravelHistory.DAO;

import com.group2.MyTravelHistory.Model.Accommodation;
import com.group2.MyTravelHistory.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

import java.util.Optional;

@Component
public interface AccommodationDAO extends CrudRepository<Accommodation, Long> {

    List<Accommodation> findByAccommodationNameLike(String accommodationName);

}
