package com.javaee.example.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "SessionServletAuthentication", value = "/SessionServletAuthentication")
public class SessionServletAuthentication extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("current_user");

        if (user == null) {
            // response for an anonymous user
            // authorization
            // registration
            // session.setAttribute("current_user", ID)
        } else {
            // response for an authorized user
        }

        getServletContext()
                .getRequestDispatcher("/showCart.jsp")
                .forward(request, response);
    }
}
