package bglist.user;

import java.util.Optional;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public Optional<User> getUserById(Long user_id){
        return userRepository.findById(user_id);
    }
}
