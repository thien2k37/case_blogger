package controller;

import model.Category;
import model.Post;
import model.User;
import service.CategoryService;
import service.PostService;
import service.UserService;
import service.impl.CategoryServiceImpl;
import service.impl.PostServiceImpl;
import service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "PostServlet", urlPatterns = "/post")
public class PostServlet extends HttpServlet {
    CategoryService categoryService = new CategoryServiceImpl();
    PostServiceImpl postService = new PostServiceImpl();

    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "view":
                showViewTrend(request, response);
                break;
            default:
                showList(request, response);

        }
    }

    private void showViewTrend(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Post> posts = postService.findTrend();
        request.setAttribute("posts", posts);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("test.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Category> categories = categoryService.findAll();
        request.setAttribute("cate", categories);
        List<User> users = userService.findAll();
        request.setAttribute("user", users);
        int id = Integer.parseInt(request.getParameter("id"));
        Post post = postService.findById(id);
        request.setAttribute("post", post);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("test.jsp");
        requestDispatcher.forward(request, response);

    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        List<Post> posts = postService.findAll();
        request.setAttribute("post", posts);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
