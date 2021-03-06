package service;

import java.sql.SQLException;

public interface GeneralService<T> {
    void add(T t) throws SQLException;
    T findById(int id);
    boolean delete(int id) throws SQLException;
    boolean update(T t) throws SQLException;
}
