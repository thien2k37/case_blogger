package controller;

import model.User;
import service.UserService;
import service.impl.UserServiceImpl;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SigUpServlet", urlPatterns = "/sigups")
public class SigUpServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String re_password = request.getParameter("repassword");
        String fullname = request.getParameter("fullname");
        if (!password.equals(re_password)) {
            response.sendRedirect("blog/login.jsp");
        } else {
            User user = (User) userService.findByName(username);
            if (user == null) {
                try {
                    userService.add(new User(username, password, fullname));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                response.sendRedirect("blog/login.jsp");
            } else {
                response.sendRedirect("blog/login.jsp");
            }
        }
    }
}
