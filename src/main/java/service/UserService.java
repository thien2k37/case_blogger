package service;

import model.User;

import java.util.List;

public interface UserService extends GeneralService<User>{
    List<User> findAll();
    User findByName(String name);

    User login(String username, String password);
}
