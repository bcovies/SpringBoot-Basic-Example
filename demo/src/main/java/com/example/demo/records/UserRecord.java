package com.example.demo.records;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
// import jakarta.validation.constraints.Pattern;

public record UserRecord(
        // @NotBlank String name,
        // @NotBlank String lastName,
        @NotBlank @Email String email,
        @NotBlank String passwd) {
}
// @NotBlank @Pattern(regexp = "\\d{11}") String phone) {
// }
