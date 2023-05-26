package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.UserJPA;
import com.example.demo.records.UserRecord;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/userRegister")
public class UserRegisterController {
    @Autowired
    private UserRegisterRepository userRepository;
    @PostMapping
    @Transactional
    public void register(@RequestBody @Valid UserRecord user){
        userRepository.save(new UserJPA(user));
    }
}
