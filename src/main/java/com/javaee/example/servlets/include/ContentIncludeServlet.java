package com.javaee.example.servlets.include;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import util.JspHelper;

import java.io.IOException;

@WebServlet(name = "ContentIncludeServlet", value = "/ContentIncludeServlet")
public class ContentIncludeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext()
                .getRequestDispatcher(JspHelper.getPath("content"))
                .forward(request, response);
    }

}
