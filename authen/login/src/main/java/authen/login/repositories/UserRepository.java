package authen.login.repositories;

import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;
import authen.login.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
