package com.group2.MyTravelHistory.Service;

import com.group2.MyTravelHistory.DAO.HolidayLocationVisitDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HolidayLocationVisitService {

    @Autowired
    HolidayLocationVisitDAO holLocVisDao;



}
