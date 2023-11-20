package amaroadonis.personalblog.configuration;

import amaroadonis.personalblog.entities.User;
import amaroadonis.personalblog.repositories.PostRepository;
import amaroadonis.personalblog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    public Config(UserRepository userRepository, PostRepository postRepository) {
        this.userRepository = userRepository;
        this.postRepository = postRepository;
    }


}
