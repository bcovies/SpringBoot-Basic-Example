package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import com.example.demo.record.User;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
public class DemoApplicationTests {

    @Autowired
    private JacksonTester<User> json; //User Record

    @Test
    public void userSerializationTest() throws IOException {
        User user = new User("Bruno");
        assertThat(json.write(user)).isStrictlyEqualToJson("expected.json");
        assertThat(json.write(user)).hasJsonPathStringValue("@.name");
        assertThat(json.write(user)).extractingJsonPathStringValue("@.name")
                .isEqualTo("Bruno");

    }
}