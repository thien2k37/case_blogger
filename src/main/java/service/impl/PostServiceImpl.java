package service.impl;

import model.Post;
import model.User;
import service.PostService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostServiceImpl implements PostService {
    private static String jdbcURL = "jdbc:mysql://localhost:3306/blogDB?useSSL=false";
    private static String jdbcUsername = "root";
    private static String jdbcPassword = "123456";

    protected static Connection getConnection(){
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
    public List<Post> findAll() {
        List<Post>  posts = new ArrayList<>();

        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement("select * from posts");) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                int view_number = rs.getInt("view_number");
                String image = rs.getString("image");
                String content = rs.getString("content");
                int category_id = rs.getInt("category_id");
                int user_id = rs.getInt("user_id");
                String date = rs.getString("date");
                posts.add(new Post(id,title,view_number,image,content,category_id,user_id,date));

            }
        } catch (SQLException e) {
        }

        return posts;
    }

    public List<Post> findTrend() {
        List<Post>  posts = new ArrayList<>();

        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement("select * from posts order by view_number desc limit 3");) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String title = rs.getString("title");
                int view_number = rs.getInt("view_number");
                String image = rs.getString("image");
                String content = rs.getString("content");
                int category_id = rs.getInt("category_id");
                int user_id = rs.getInt("user_id");
                String date = rs.getString("date");
                posts.add(new Post(id,title,view_number,image,content,category_id,user_id,date));

            }
        } catch (SQLException e) {
        }

        return posts;
    }

    @Override
    public void add(Post post) throws SQLException {

    }

    @Override
    public Post findById(int id) {
        Post post = new Post();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from users where id = ? limmit (3)");) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {

                String title = rs.getString("title");
                int view_number = rs.getInt("view_number");
                String image = rs.getString("image");
                String content = rs.getString("content");
                int category_id = rs.getInt("category_id");
                int user_id = rs.getInt("user_id");
                String date = rs.getString("date");
                post =new Post(id,title,view_number,image,content,category_id,user_id,date);

            }
        } catch (SQLException e) {
        }
        return post;
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
    public List<Post> findByName(String name) {
        return null;
    }
}
