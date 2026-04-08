package com.maincrafts.contactmanagement.controller;

import com.maincrafts.contactmanagement.JWT.JwtUtil;
import com.maincrafts.contactmanagement.entity.User;
import com.maincrafts.contactmanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository repo;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private PasswordEncoder encoder;

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        repo.save(user);
        return "User Registered";
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        User dbUser = repo.findByUsername(user.getUsername());

        if (dbUser != null && encoder.matches(user.getPassword(), dbUser.getPassword())) {
            return jwtUtil.generateToken(user.getUsername());
        }

        return "Invalid credentials";
    }
}