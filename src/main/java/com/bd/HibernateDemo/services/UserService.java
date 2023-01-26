package com.bd.HibernateDemo.services;
import com.bd.HibernateDemo.models.User;
import com.bd.HibernateDemo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    public List<User> getUsersByLocation(Integer id) {
        return userRepository.findByLocationId(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

}
