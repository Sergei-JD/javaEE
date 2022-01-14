package com.javaee.example.servlets.session;

import com.javaee.example.additionally.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static util.ServletConst.USER;

@WebServlet(name = "SessionFullNameServlet", value = "/SessionFullNameServlet")
public class SessionFullNameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute(USER);

        if (user != null) {
            response.setContentType("text/html");
            response.setCharacterEncoding(StandardCharsets.UTF_8.name());
            response.getWriter().write("<p>" + user.fullName() + "</p>");
        }
    }

}
