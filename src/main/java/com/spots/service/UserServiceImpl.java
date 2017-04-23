package com.spots.service;

import com.spots.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public User findByEmail(String email) {

        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }

        return null;
    }

    @Override
    public User saveUser(User newUser) {
        //TODO: maybe fill with more info
        users.add(newUser);
        return newUser;
    }
}
