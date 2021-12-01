package register.loginfix;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import register.loginfix.entities.User;
import register.loginfix.repositories.UserRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class UserRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;
    @Autowired
    private UserRepository userRepository;

    @Test
    public void createUser() {
        User user = new User();
        user.setEmail("pawut.j@gmail.com");
        user.setPassword("12345678");
        user.setUsername("pawut");

        User savedUser = userRepository.save(user);
        User findUser = entityManager.find(User.class, savedUser.getId());
        assertEquals(findUser.getEmail(), user.getEmail());

    }
}
