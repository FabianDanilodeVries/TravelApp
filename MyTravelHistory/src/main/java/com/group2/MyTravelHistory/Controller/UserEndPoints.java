package com.group2.MyTravelHistory.Controller;


import com.group2.MyTravelHistory.Dto.UserDto;
import com.group2.MyTravelHistory.Model.Login;
import com.group2.MyTravelHistory.Model.User;
import com.group2.MyTravelHistory.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserEndPoints {
    @Autowired
    UserService us;

    @PostMapping("/user/createNewUser")
    public void createNewUser(@RequestBody User newUser){
        us.addUserToDao(newUser);
    }

    @PostMapping(path="/user/logIn", produces = "application/json")
    public ResponseEntity<String> userLogIn(@RequestBody Login login){
        Optional<User> userOptional = this.us.checkLogInCredentials(login.getUserName(),login.getPassword());
        if(userOptional.isPresent()){
//            User u = userOptional.get();
//            UserDto userDto = new UserDto();
//            userDto.setUserId(u.getUserId());
//            userDto.setUserName(u.getUserName());
//            userDto.setEmail(u.getEmail());
            return new ResponseEntity(HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.UNAUTHORIZED);
//
    }

    @GetMapping("/user/showAllUsers")
    public Iterable<User> showAllUsers(){
        return us.fetchAllUsersFromDAO();
    }

    @GetMapping(path="/user/getUserId/{userName}",produces = "application/json")
    public Long getUserId(@PathVariable("userName") String userName){
        System.out.println(userName);
        Long theId = us.findUserByName(userName).get().getUserId();
        System.out.println(theId);

        return theId;
    }


    @GetMapping("/user/findByUserName/{userName}")
    public UserDto findUserByName(@PathVariable("userName") String userName){
        System.out.println(userName);
        Optional<User> userOptional = this.us.findUserByName(userName);
        User u = userOptional.get();
        UserDto userDto = new UserDto();
        userDto.setUserId(u.getUserId());
        userDto.setUserName(u.getUserName());
        userDto.setEmail(u.getEmail());
        return userDto;
    }
}
