package com.group2.MyTravelHistory.Service;


import com.group2.MyTravelHistory.DAO.UserDAO;
import com.group2.MyTravelHistory.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserDAO uDao;

    public User addUserToDao(User newUser){
        return uDao.save(newUser);
    }



}
