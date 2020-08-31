package com.group2.MyTravelHistory.DAO;

import com.group2.MyTravelHistory.Model.HolidayLocationVisit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface HolidayLocationVisitDAO extends CrudRepository <HolidayLocationVisit, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM holiday_location_visit WHERE country =?1")
    List<HolidayLocationVisit> searchHLVisitDAOByCountry(String country);

//    @Query(nativeQuery = true, value = "SELECT * FROM holiday_location_visit WHERE userId=?1")
//    List<HolidayLocationVisit> findAllHLVisitByUserId(Long userId);
        List<HolidayLocationVisit> findHolidayLocationVisitByUserUserId(Long userId);


//    @Query(value = "SELECT u FROM User u")
//    List<User> findAllUsers(Sort sort);


}
