package com.group2.MyTravelHistory.Controller;

import com.group2.MyTravelHistory.Model.HolidayLocationVisit;
import com.group2.MyTravelHistory.Service.HolidayLocationVisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HolidayLocationVisitEndPoints {

    @Autowired
    HolidayLocationVisitService HLVisitService;


    @PostMapping("/HLVisit/createNewHLVisit")
    public void createNewHLVisit(@RequestBody HolidayLocationVisit holidayLocationVisit){
        HLVisitService.addHLVisitToDAO(holidayLocationVisit);
    }

    @DeleteMapping("/HLVisit/deleteHLVisit/{visitId}")
    public void deleteHLVisit(@PathVariable("visitId") Long visitId){
        HLVisitService.deleteHLVisitFromDAO(visitId);
    }

    @GetMapping("/HLVisit/findUserHLVisits/{userId}")
    public List<HolidayLocationVisit> findUserHLVisits(@PathVariable("userId") Long userId){
//        System.out.println("We got here");
//        System.out.println(HLVisitService.findUserHLVisits(userId).size());
        return HLVisitService.findUserHLVisits(userId);
    }

    @GetMapping("/HLVisit/searchHLVisit/{country}")
    public List<HolidayLocationVisit> searchHLVisitByCountry(@PathVariable("country") String country){
        return HLVisitService.searchHLVisitByCountry(country);
    }

}
