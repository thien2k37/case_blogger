package service.impl;

import model.Post;
import model.User;
import service.PostService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class PostServiceImpl implements PostService {
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

    public PostServiceImpl() {
    }

    @Override
    public User add(Post post) throws SQLException {

        return null;
    }

    @Override
    public Post findById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean update(Post post) throws SQLException {
        return false;
    }

    @Override
    public List<Post> findAll() {
        return null;
    }

    @Override
    public List<Post> findByName(String name) {
        return null;
    }
}
