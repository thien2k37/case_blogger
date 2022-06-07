package controller;

import model.User;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    UserService userService = new UserServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        RequestDispatcher requestDispatcher = request.getRequestDispatcher("blog/login.jsp");
//        requestDispatcher.forward(request,response);
//        String action = request.getParameter("action");
//        if (action == null) {
//            switch (action) {
//                case "login":
        //            }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("blog/login.jsp");
        requestDispatcher.forward(request,response);

        }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userService.login1(username, password);
        if (user == null) {
            request.getRequestDispatcher("blog/login.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("acc" ,user);
            response.sendRedirect("index.jsp");
        }
    }


    }

//    private void sigup(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        String fullname = request.getParameter("full_name");
//        User user = userService.findByName(username);
//        if (user == null) {
//            try {
//                userService.add(new User(username, password, fullname));
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//            response.sendRedirect("blog/login.jsp");
//        } else {
//            response.sendRedirect("blog/login.jsp");
//        }
//
//
//    }
//
//    private void login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        User user = userService.login(username, password);
//        if (user == null) {
//            request.getRequestDispatcher("blog/login.jsp").forward(request, response);
//        } else {
//            HttpSession session = request.getSession();
//            session.setAttribute("acc" ,user);
//            response.sendRedirect("index.jsp");
//        }
//    }
