package com.esi.genom.controller.users;

import com.esi.genom.entities.users.ApiResponse;
import com.esi.genom.entities.users.User;
import com.esi.genom.dto.users.UserDto;
import com.esi.genom.services.users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //@Secured({"ROLE_ADMIN", "ROLE_USER"})
    // @PreAuthorize("hasRole('ADMIN')")

    @RequestMapping(value="/users", method = RequestMethod.GET)
    public ApiResponse<List<User>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",userService.findAll());
    }
    //@Secured("ROLE_USER")
    //@PreAuthorize("hasRole('USER')")
    ////@PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public User getOne(@PathVariable(value = "id") Long id){
        return userService.findById(id);
    }


    @RequestMapping(value="/users/signup", method = RequestMethod.POST)
    public ApiResponse<User> saveUser(@RequestBody User user){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",userService.save(user));
    }
    
    @RequestMapping(value="/users/username/{username}", method = RequestMethod.GET)
    public ApiResponse<User> getUserByUsername(@PathVariable (value = "username")String username){
        return new ApiResponse<User>(HttpStatus.OK.value(), "User return successfully.",userService.findByUsername(username));
    }



}