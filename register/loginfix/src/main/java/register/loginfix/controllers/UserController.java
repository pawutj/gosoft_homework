package register.loginfix.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.config.web.server.ServerHttpSecurity.HttpsRedirectSpec;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import register.loginfix.repositories.UserRepository;
import register.loginfix.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import register.loginfix.entities.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public String getUser() {
        return "index";
    }

    @PostMapping("")
    public ResponseEntity<?> postUser(@RequestBody User body) {
        User user = userService.createUser(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
