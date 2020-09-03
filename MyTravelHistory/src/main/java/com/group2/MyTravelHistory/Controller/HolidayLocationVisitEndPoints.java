package com.group2.MyTravelHistory.Controller;

import com.group2.MyTravelHistory.Dto.HolidayLocationVisitDto;
import com.group2.MyTravelHistory.Model.HolidayLocationVisit;
import com.group2.MyTravelHistory.Service.AccommodationService;
import com.group2.MyTravelHistory.Service.HolidayLocationVisitService;
import com.group2.MyTravelHistory.Service.RestaurantService;
import com.group2.MyTravelHistory.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HolidayLocationVisitEndPoints {

    @Autowired
    HolidayLocationVisitService HLVisitService;
    @Autowired
    AccommodationService accommodationService;
    @Autowired
    RestaurantService restaurantService;
    @Autowired
    UserService userService;


    @PostMapping("/HLVisit/createNewHLVisit")
    public void createNewHLVisit(@RequestBody HolidayLocationVisitDto holidayLocationVisitDto){
        HolidayLocationVisit newHolidayLocationVisit = new HolidayLocationVisit();
        newHolidayLocationVisit.setComment(holidayLocationVisitDto.getComment());
        newHolidayLocationVisit.setDatum(holidayLocationVisitDto.getDatum());
        newHolidayLocationVisit.setRating(holidayLocationVisitDto.getRating());
        newHolidayLocationVisit.setVisitType(holidayLocationVisitDto.getVisitType());
        if (holidayLocationVisitDto.getAccId() != null){
            newHolidayLocationVisit.setAccommodation(accommodationService.findAccommodationById(holidayLocationVisitDto.getAccId()).get());
            accommodationService.findAccommodationById(holidayLocationVisitDto.getAccId()).get().updateAccommodationAverageRating(holidayLocationVisitDto.getRating());
        }else {
            newHolidayLocationVisit.setAccommodation(null);
        }
        if(holidayLocationVisitDto.getRestId() != null){
           newHolidayLocationVisit.setRestaurant(restaurantService.findRestaurantById(holidayLocationVisitDto.getRestId()).get());
            restaurantService.findRestaurantById(holidayLocationVisitDto.getRestId()).get().updateRestaurantAverageRating(holidayLocationVisitDto.getRating());
        }else{
            newHolidayLocationVisit.setRestaurant(null);
        }
        newHolidayLocationVisit.setUser(userService.findUserById(holidayLocationVisitDto.getUserId()).get());
        HLVisitService.addHLVisitToDAO(newHolidayLocationVisit);

    }

    @DeleteMapping("/HLVisit/deleteHLVisit/{visitId}")
    public void deleteHLVisit(@PathVariable("visitId") Long visitId){
        HLVisitService.deleteHLVisitFromDAO(visitId);
    }

    @GetMapping("/HLVisit/findUserHLVisits/{userId}")
    public List<HolidayLocationVisit> findUserHLVisits(@PathVariable("userId") Long userId){
        return HLVisitService.findUserHLVisits(userId);
    }

    @GetMapping("/HLVisit/searchHLVisit/{country}")
    public List<HolidayLocationVisit> searchHLVisitByCountry(@PathVariable("country") String country){
        return HLVisitService.searchHLVisitByCountry(country);
    }

}
