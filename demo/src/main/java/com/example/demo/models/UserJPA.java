package com.example.demo.models;

import com.example.demo.records.UserRecord;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "users")
@Entity(name = "User")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class UserJPA {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String lastName;
    private String phone;
    private String email;


    public UserJPA(UserRecord user) {
        this.name = user.name();
        this.lastName = user.lastName();
        this.phone = user.phone();
        this.email = user.email();
    }
}
