package com.example.RestReturnIdAfterInputNumberDate.services;

import com.example.RestReturnIdAfterInputNumberDate.entities.User;
import com.example.RestReturnIdAfterInputNumberDate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public long addUser(User user){
        userRepository.save(user);
        return user.getId();
    }

}

