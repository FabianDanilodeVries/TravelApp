package com.group2.MyTravelHistory.DAO;


import com.group2.MyTravelHistory.Model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserDAO extends CrudRepository<User, Long> {



}
