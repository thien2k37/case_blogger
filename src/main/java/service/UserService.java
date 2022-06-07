package service;

import model.User;

import java.util.List;

public interface UserService extends GeneralService<User>{
    List<User> findAll();
    User findByName(String name);

    User login(String username, String password);

    User login1(String username, String password);

    void signup(String username, String password, String full_name);
}
