package com.group2.MyTravelHistory.Controller;

import com.group2.MyTravelHistory.Dto.AccommodationByNameDto;
import com.group2.MyTravelHistory.Model.Accommodation;
import com.group2.MyTravelHistory.Service.AccommodationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AccommodationEndPoints {

    @Autowired
    AccommodationService accService;

    @PostMapping("/Accommodation/addNewAccommodation")
    public void createNewAccommodation(@RequestBody Accommodation newAccommodation){
        accService.addAccommodationToDao(newAccommodation);
    }

    @GetMapping("/Accommodation/ShowAllAccommodations")
    public Iterable<Accommodation> showAllAccommodations(){
        return this.accService.findAllAccommodationsFromDAO();
    }

    @GetMapping("/Accommodation/findAccommodationByName/{accommodationName}")
    public List<AccommodationByNameDto> findAccommodationByNameLike(@PathVariable("accommodationName") String accommodationName){
        List<Accommodation> accommodationList = this.accService.findAccommodationByNameLike("%" + accommodationName + "%");
        List<AccommodationByNameDto> accBYNameDtoList = new ArrayList<>();
        for (Accommodation a : accommodationList) {
            AccommodationByNameDto nameDto = new AccommodationByNameDto();
            nameDto.setAccommodationName(a.getAccommodationName());
            accBYNameDtoList.add(nameDto);
        }
        return accBYNameDtoList;
    }
}

