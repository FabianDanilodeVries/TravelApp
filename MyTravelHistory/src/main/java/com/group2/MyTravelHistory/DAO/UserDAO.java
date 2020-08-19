package com.group2.MyTravelHistory.DAO;


import com.group2.MyTravelHistory.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface UserDAO extends CrudRepository<User, Long> {


    Optional<User> findByUserNameAndPassword(String userName,String password);

    Optional<User> findByUserName(String userName);
}
