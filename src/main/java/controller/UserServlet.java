package controller;

import model.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UserServlet", urlPatterns = "/users")
public class UserServlet extends HttpServlet {

    UserService userService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateForm(request, response);
                break;
            case "delete":
                try {
                    delete(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "view":
                showView(request, response);
                break;
            case "edit":
                showEdit(request, response);
                break;

            default:
                showList(request, response);
        }
    }

    private void showEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = (User) userService.findById(id);
        request.setAttribute("user", user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/edit.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        User user = (User) userService.findById(id);
        request.setAttribute("user", user);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("user/view.jsp");
        requestDispatcher.forward(request, response);
    }

    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        userService.delete(id);
        response.sendRedirect("users");

    }

    private void showCreateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("user/create.jsp").forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        List<User> userList;
        if (key != null & key != "") {
            /*userList = userService.findByName(key);*/
        } else {
            userList = userService.findAll();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("user/list.jsp");
        /*request.setAttribute("user", userList);*/
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    create(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
            case "edit":
                try {
                    edit(request, response);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;

        }

    }

    private void edit(HttpServletRequest request, HttpServletResponse response) throws IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String full_name = request.getParameter("full_name");
        int level = Integer.parseInt(request.getParameter("level"));
        User user = new User(id, username, password,full_name,level);
        userService.update(user);
        response.sendRedirect("/users");
    }


    private void create(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String full_name = request.getParameter("full_name");
        int level = Integer.parseInt(request.getParameter("level_id"));
        userService.add(new User(0, username, password, full_name, level));
        response.sendRedirect("");
    }
}
