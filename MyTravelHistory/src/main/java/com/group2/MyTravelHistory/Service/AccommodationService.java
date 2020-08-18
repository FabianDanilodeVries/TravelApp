package com.group2.MyTravelHistory.Service;

import com.group2.MyTravelHistory.DAO.AccommodationDAO;
import com.group2.MyTravelHistory.Model.Accommodation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccommodationService {

    @Autowired
    AccommodationDAO accDAO;

    public void addAccommodationToDao(Accommodation newAccommodation){
        accDAO.save(newAccommodation);
    }

    public Iterable<Accommodation> findAllAccommodationsFromDAO(){
        return accDAO.findAll();
    }

    public List<Accommodation> findAccommodationByNameLike(String accommodationName){
        return accDAO.findByAccommodationNameLike(accommodationName);
    }

}

