package com.group2.MyTravelHistory.Service;

import com.group2.MyTravelHistory.DAO.AccommodationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccommodationService {

    @Autowired
    AccommodationDAO accDAO;


}
