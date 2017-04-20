package com.spots.api;

import com.spots.api.errors.UnauthorizedException;
import com.spots.model.User;
import com.spots.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public @ResponseBody User logIn(@RequestBody User userLogin) { // user que hace login

        User user = userService.findByEmail(userLogin.getEmail()); //user que retorno de la db.

        if (user != null && user.getPwd().equals(userLogin.getPwd())) { // && y || son operadores Lazy
            return user;
        } else {
            throw new UnauthorizedException("login error");
        }
    }
}
