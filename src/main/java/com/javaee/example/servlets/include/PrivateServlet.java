package com.javaee.example.servlets.include;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import util.JspHelper;

import java.io.IOException;

@WebServlet(name = "PrivateServlet", value = "/PrivateServlet")
public class PrivateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext()
                .getRequestDispatcher(JspHelper.getPath("private"))
                .forward(request, response);
    }
}
