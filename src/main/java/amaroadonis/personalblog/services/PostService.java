package amaroadonis.personalblog.services;

import amaroadonis.personalblog.entities.Post;
import amaroadonis.personalblog.entities.User;
import amaroadonis.personalblog.repositories.PostRepository;
import amaroadonis.personalblog.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public List<Post> findAll() {
        return repository.findAll();
    }

    public Post findById(Integer id) {
        Optional<Post> post = repository.findById(id);
        return  post.get();
    }



}
