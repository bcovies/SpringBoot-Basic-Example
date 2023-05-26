package com.example.demo.controllers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.UserJPA;

public interface UserRegisterRepository extends JpaRepository<UserJPA, Long> {

}
