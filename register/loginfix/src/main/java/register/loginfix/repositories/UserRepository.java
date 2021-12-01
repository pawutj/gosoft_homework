package register.loginfix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import register.loginfix.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
