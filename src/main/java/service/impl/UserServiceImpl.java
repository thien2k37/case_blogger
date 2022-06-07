package service.impl;

import model.User;
import service.UserService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private String jdbcURL = "jdbc:mysql://localhost:3306/blogDB?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Dinhhoc8";

    protected Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    public UserServiceImpl() {

    }

    @Override
    public User add(User user) throws SQLException {
        try(Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users( username, password, full_name) values (0,?,?,?,2)")) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFull_name());
            preparedStatement.executeUpdate();
        }
        return user;
    }

    @Override
    public User findById(int id) {
        User user = new User();
        try(Connection connection = getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users where id= ?")) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idUser = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String full_name = resultSet.getString("full_name");
                int level = resultSet.getInt("level");
                user = new User(id, username, password, full_name, level);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users where id = ?")) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
        return false;
    }

    @Override
    public boolean update(User user) throws SQLException {
        boolean rowUpdate;
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update users set username= ?, password =?, full_name = ? where id = ?");) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getFull_name());
            preparedStatement.setInt(4, user.getId());
            preparedStatement.executeUpdate();
            rowUpdate = preparedStatement.executeUpdate() > 0;
        }
        return rowUpdate;
    }

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users")) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String full_name = resultSet.getString("full_name");
                int level = resultSet.getInt("level");
                userList.add(new User(id, username, password, full_name, level));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    @Override
    public User findByName(String username) {
        List<User> userList = findAll();
        for (User user: userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public User login(String username, String password) {
        List<User> userList = findAll();
        for (User user: userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public User login1(String username, String password) {
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users where username= ? and password=?")) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
               return new User(
                       resultSet.getInt(1),
                       resultSet.getString(2),
                       resultSet.getString(3),
                       resultSet.getString(4),
                       resultSet.getInt(5)
               );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public void signup(String username, String password, String full_name) {
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users values (0,?,?,?,2)")) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2,password);
            preparedStatement.setString(3, full_name);
            preparedStatement.executeUpdate();

            } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
