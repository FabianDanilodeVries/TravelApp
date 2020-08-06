package com.group2.MyTravelHistory.Controller;


import com.group2.MyTravelHistory.Model.User;
import com.group2.MyTravelHistory.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserEndPoints {
    @Autowired
    UserService us;

    @PostMapping("/createAccount")
    public User createNewUser(@RequestBody User newUser){
        return us.addUserToDao(newUser);
    }

    @GetMapping("/checkCredentials")
    public void checkCredentials(@RequestBody String userName,String password){
//        us.checkUserInDAO(userName,password);
    }



}
