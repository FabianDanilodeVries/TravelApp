package com.group2.MyTravelHistory.DAO;

import com.group2.MyTravelHistory.Model.Accommodation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AccommodationDAO extends CrudRepository<Accommodation, Long> {

    List<Accommodation> findByAccommodationNameLike(String accommodationName);

}
