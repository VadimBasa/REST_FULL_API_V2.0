package springbootdemo.service;

import org.springframework.stereotype.Service;
import springbootdemo.SystemProfile;
import springbootdemo.model.User;
import springbootdemo.repository.UserRepository;

import java.util.List;

@Service
public class ServiceUserDefault implements SystemProfile {

    private UserRepository userRepository;

    public ServiceUserDefault(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ServiceUserDefault() {

    }

    public String getProfile(){
        return "Current profile is User Default";
    };

    public User findById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(
                        () -> new RuntimeException(String.format("User with id %d not found", id))
                );
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
