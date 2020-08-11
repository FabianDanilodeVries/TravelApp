package com.group2.MyTravelHistory.Controller;


import com.group2.MyTravelHistory.Model.User;
import com.group2.MyTravelHistory.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserEndPoints {
    @Autowired
    UserService us;

    @PostMapping("/user/createAccount")
    public void createNewUser(@RequestBody User newUser){
        us.addUserToDao(newUser);
    }

    @GetMapping("/user/showAllUsers")
    public Iterable<User> showAllUsers(){
        return us.fetchAllUsersFromDAO();
    }

    @GetMapping("/user/findByUserName/{name}")
    public List<User> findUserByName(@PathVariable("userName") String userName){
        return this.us.findUserByName(userName);
    }




//    @GetMapping("/checkCredentials")
//    public void checkCredentials(@RequestBody String userName,String password){
////        us.checkUserInDAO(userName,password);
//    }



}
