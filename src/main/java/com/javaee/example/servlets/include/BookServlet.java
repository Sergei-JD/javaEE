package com.javaee.example.servlets.include;

import com.javaee.example.additionally.Book;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import util.JspHelper;

import java.io.IOException;

@WebServlet(name = "BookServlet", value = "/BookServlet")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getSession().setAttribute("book", new Book("Java 8"));
        getServletContext()
                .getRequestDispatcher(JspHelper.getPath("book"))
                .forward(request, response);
    }
}
