package service;

import model.User;

import java.util.List;

public interface UserService extends GeneralService<User>{
    List<User> findAll();
    List<User> findByName(String name);
}
