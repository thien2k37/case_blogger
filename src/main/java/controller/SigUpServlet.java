package controller;

import model.User;
import service.UserService;
import service.impl.UserServiceImpl;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "SigUpServlet", urlPatterns = "/sig_up")
public class SigUpServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("blog/login.jsp");
//        requestDispatcher.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String full_name = request.getParameter("full_name");
        User user = userService.findByName(username);
        if (user == null) {
            userService.signup(username, password, full_name);
            response.sendRedirect("blog/login.jsp");
        } else {
            response.sendRedirect("blog/login.jsp");
        }

    }
}
