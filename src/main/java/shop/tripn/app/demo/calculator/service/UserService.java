package shop.tripn.app.demo.calculator.service;

import shop.tripn.app.demo.calculator.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    List<User> findAllByName(String name);
    Optional <User> findById(long id);
}
