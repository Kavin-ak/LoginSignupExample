package com.LoginSignupExample;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.LoginSignupExample.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static Map<String, User> users = new HashMap<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        users.put(username, new User(username, password));

        response.getWriter().println("User created successfully!");
    }
}