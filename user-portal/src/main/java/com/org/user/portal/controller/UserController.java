package com.org.user.portal.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.user.portal.entity.User;
import com.org.user.portal.service.UserService;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class UserController {

	@Autowired
    private UserService userService;

    @PostMapping
    public User create(@RequestBody User user){
         userService.create(user);
         return user;
    }

    @GetMapping(path = {"/{id}"})
    public Optional<User> findOne(@PathVariable("id") int id){
        return userService.findById(id);
    }

    @PutMapping
    public User update(@RequestBody User user){
        userService.update(user);
        return user;
    }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
}
