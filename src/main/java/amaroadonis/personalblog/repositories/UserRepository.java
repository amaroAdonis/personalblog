package amaroadonis.personalblog.repositories;

import amaroadonis.personalblog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {



}
