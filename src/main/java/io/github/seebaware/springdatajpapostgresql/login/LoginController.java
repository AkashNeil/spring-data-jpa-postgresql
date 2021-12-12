package io.github.seebaware.springdatajpapostgresql.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String loggedIn() {
        return "Welcome to the API.";
    }

}
