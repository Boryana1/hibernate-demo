package com.bd.HibernateDemo.controllers;
import com.bd.HibernateDemo.models.Post;
import com.bd.HibernateDemo.models.User;
import com.bd.HibernateDemo.services.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUserById(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("user/{id}/posts")
    public List<Post> getPostsByUser(@PathVariable Integer id) {
        Optional<User> user = userService.getUserById(id);

        if(user.isPresent()) {
            User newUser = user.get();
            return newUser.getPosts();
        }
        return null;
    }

    @GetMapping("users/location/{id}/users")
    public List<User> getUsersByLocation(@PathVariable Integer id) {
        return userService.getUsersByLocation(id);
    }

    @PostMapping("/users/addNew")
    public void AddUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @PutMapping("/users/{id}/update")
    public void UpdateUser(@RequestBody User user) {
        userService.updateUser(user);
    }

}
