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

      @GetMapping("/{requestedId}")
      public ResponseEntity<User> findById(@PathVariable String requestedId) {
            if (requestedId.equals(1L)) {
                  User user = new User(1L, "Bruno");
                  return ResponseEntity.ok(user);
            } else {
                  return ResponseEntity.notFound().build();
            }
      }
}