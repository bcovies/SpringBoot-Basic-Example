package com.example.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/user")
public class UserController {

      @GetMapping("/{requestedName}")
      public ResponseEntity<User> findById() {
            User user = new User("Bruno");
            return ResponseEntity.ok(user);
      }
}