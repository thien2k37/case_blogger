package controller;

import model.Category;
import model.Post;
import model.User;
import service.PostService;
import service.impl.CategoryServiceImpl;
import service.impl.PostServiceImpl;
import service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ManageServlet", urlPatterns = "/manage")
public class ManageBloggerServlet extends HttpServlet {
    PostService postService = new PostServiceImpl();
    UserServiceImpl userService = new UserServiceImpl();
    CategoryServiceImpl categoryService = new CategoryServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "logout":
                logout(request,response);
                break;
            case "delete":
                try {
                    deleteBlog(request,response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                showALlBlog(request, response);
        }
    }
    private void deleteBlog(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        postService.delete(id);
        response.sendRedirect("manage");
    }

    private void showALlBlog(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("admin/manage_blogger.jsp");
        String findName = request.getParameter("findName");
        String view = request.getParameter("view_blog");
        List<Post> posts = postService.findAll();
        if (findName != null) {
            try {
                posts = postService.findByName(findName);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        if (view != null) {
            posts = postService.viewBlog();
        }
        List<User> userList = userService.showAllUser(posts);
        List<Category> categoryList = categoryService.showListCategory(posts);
        request.setAttribute("ListUser" , userList);
        request.setAttribute("listCategory", categoryList);
        request.setAttribute("listP", posts);
        requestDispatcher.forward(request, response);
    }

    private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("acc");
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "logout":
                Logout(request,response);
                break;
        }
    }
    private void Logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("acc");
        response.sendRedirect("index.jsp");
    }
}

