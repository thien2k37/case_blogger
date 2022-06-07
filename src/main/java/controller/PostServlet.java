package controller;

import model.Post;
import service.PostService;

import service.impl.PostServiceImpl;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "PostServlet", urlPatterns = "/posts")
public class PostServlet extends HttpServlet {
    PostService postService = new PostServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "delete":
                try {
                    deleteByUser(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            default:
                showListPost(request, response);
        }
    }

    private void deleteByUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        postService.delete(id);
    }

    private void showListPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("blog/post.jsp");
        List<Post> posts = postService.findAll();
        request.setAttribute("listPost", posts);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
