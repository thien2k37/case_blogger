package service;

import model.User;

import java.sql.SQLException;

public interface GeneralService<T> {
    User add(T t) throws SQLException;
    T findById(int id);
    boolean delete(int id) throws SQLException;
    boolean update(T t) throws SQLException;
}
