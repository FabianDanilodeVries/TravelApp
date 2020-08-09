package com.group2.MyTravelHistory.DAO;

import com.group2.MyTravelHistory.Model.HolidayLocationVisit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface HolidayLocationVisitDAO extends CrudRepository <HolidayLocationVisit, Long> {

}
