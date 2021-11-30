package authen.login.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import authen.login.repositories.UserRepository;
import authen.login.services.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import authen.login.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public List<User> getUsers() {
        return userService.retriveUser();
    }

    @PostMapping()
    public ResponseEntity<?> postPerson(@RequestBody User body) {
        User user = userService.createUser(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

}
