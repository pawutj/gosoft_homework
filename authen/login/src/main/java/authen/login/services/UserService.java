package authen.login.services;

import org.springframework.beans.factory.annotation.Autowired;

import authen.login.repositories.UserRepository;

import authen.login.entities.User;
import java.util.List;

public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> retriveUser() {
        return (List<User>) userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

}
