package springbootdemo.service;

import springbootdemo.model.User;

import java.util.List;

public interface ServiceUserInterface {
    User findById(Long id);

    List<User> findAll();

    User saveUser(User user);

    void deleteById(Long id);
}
