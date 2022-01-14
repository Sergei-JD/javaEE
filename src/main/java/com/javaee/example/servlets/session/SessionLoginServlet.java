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

@WebServlet(name = "SessionLoginServlet", value = "/SessionLoginServlet")
public class SessionLoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = (User) request.getSession().getAttribute(USER);

        if (user == null) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");

            if (firstName != null && lastName != null) {
                request.getSession().setAttribute(USER, new User(firstName, lastName));
            } else {
                response.setContentType("text/html");
                response.setCharacterEncoding(StandardCharsets.UTF_8.name());
                response.getWriter().write("Enter the user's first and last name!");
            }
        }

    }
}
