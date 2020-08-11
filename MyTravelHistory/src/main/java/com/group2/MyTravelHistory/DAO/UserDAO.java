package com.group2.MyTravelHistory.DAO;


import com.group2.MyTravelHistory.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDAO extends CrudRepository<User, Long> {


    List<User> findByUserName(String userName);


}
