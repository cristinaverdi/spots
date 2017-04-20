package com.spots.service;

import com.spots.model.User;

public interface UserService {

    /** Finds user by email or null if it doesn't exist */
    User findByEmail(String email);
}
