package com.spots.service;

import com.spots.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User findByEmail(String email) {
        // TODO: fake
        User user = new User();
        user.setEmail(email);
        user.setPwd(email);
        return user;
    }
}
