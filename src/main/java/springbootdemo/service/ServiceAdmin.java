package springbootdemo.service;

import org.springframework.stereotype.Service;
import springbootdemo.SystemProfile;
import springbootdemo.model.User;
import springbootdemo.repository.UserRepository;

import java.util.List;

@Service
public class ServiceAdmin implements SystemProfile {

    private UserRepository userRepository;

    public ServiceAdmin(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ServiceAdmin() {

    }
    @Override
    public String getProfile(){
        return "Current profile is admin";
    };
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

}
