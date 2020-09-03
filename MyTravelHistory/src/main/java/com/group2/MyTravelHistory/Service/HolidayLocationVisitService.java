package com.group2.MyTravelHistory.Service;

import com.group2.MyTravelHistory.DAO.HolidayLocationVisitDAO;
import com.group2.MyTravelHistory.Model.HolidayLocationVisit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HolidayLocationVisitService {

    @Autowired
    HolidayLocationVisitDAO HLVisitDAO;


    public void addHLVisitToDAO(HolidayLocationVisit holidayLocationVisit){
        HLVisitDAO.save(holidayLocationVisit);
    }

    public void deleteHLVisitFromDAO(Long visitId){
        HLVisitDAO.deleteById(visitId);
    }

    public List<HolidayLocationVisit> findUserHLVisits(Long userId){
        return HLVisitDAO.findHolidayLocationVisitByUserUserId(userId);
    }

    public List<HolidayLocationVisit> searchHLVisitByCountry(String country){
        return HLVisitDAO.searchHLVisitDAOByCountry(country);
    }


}
