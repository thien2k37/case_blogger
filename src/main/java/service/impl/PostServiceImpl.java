package service.impl;

import model.Post;
import service.PostService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostServiceImpl implements PostService {
    private String jdbcURL = "jdbc:mysql://localhost:3306/blogDB?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "cxtjmg2k";

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
    public void add(Post post) throws SQLException {
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO product(id,name,age) values (?,?,?)");){
            preparedStatement.setInt(1, post.getId());
            preparedStatement.setString(2, post.getTitle());
            preparedStatement.setString(3, post.getImage());
            preparedStatement.setString(4, post.getContent());
            preparedStatement.setString(5, String.valueOf(post.getCategoryId()));
            preparedStatement.setString(6, String.valueOf(post.getUserId()));
            preparedStatement.setDate(7, post.getDate());
            preparedStatement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Post findById(int id) {
        return null;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement("DELETE from posts where id = ?");) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
        return false;
    }

    @Override
    public boolean update(Post post) throws SQLException {
        boolean rowUpdate;
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("update product set id = ?,name= ?, age =? where id = ?");) {
            preparedStatement.setString(1, String.valueOf(post.getId()));
            preparedStatement.setString(2, post.getTitle());
            preparedStatement.setString(3, post.getImage());
            preparedStatement.setString(4, post.getContent());
            preparedStatement.setString(5, String.valueOf(post.getUserId()));
            preparedStatement.setDate(6, post.getDate());
            rowUpdate = preparedStatement.executeUpdate() > 0;
        }

        return rowUpdate;
    }

    @Override
    public List<Post> findAll() {
        List<Post> posts = new ArrayList<>();
        try(Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from posts");) {
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");
                int view_number = resultSet.getInt("view_number");
                String image = resultSet.getString("image");
                String content = resultSet.getString("content");
                int categoryId = resultSet.getInt("category_id");
                int userId = resultSet.getInt("user_id");
                Date date = resultSet.getDate("date");
                posts.add(new Post(id, title, view_number, image, content, categoryId, userId, date));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return posts;
    }

    @Override
    public List<Post> findByName(String name) {
        return null;
    }
}
