package amaroadonis.personalblog.services;

import amaroadonis.personalblog.entities.User;
import amaroadonis.personalblog.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Integer id) {
        Optional<User> user = repository.findById(id);
        return  user.get();
    }



}
