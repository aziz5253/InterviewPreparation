package com.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

public class UserController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        List<String> users = Arrays.asList("Amit", "Neha", "Rahul");

        req.setAttribute("username", "Shabbir");
        req.setAttribute("userList", users);

        RequestDispatcher rd = req.getRequestDispatcher("users.jsp");
        rd.forward(req, resp);
    }
}