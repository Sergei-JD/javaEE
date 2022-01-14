package com.javaee.example.servlets.session;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

@WebServlet(name = "ServletSessionAtomicCounterServlet", value = "/ServletSessionAtomicCounterServlet")
public class ServletSessionAtomicCounterServlet extends HttpServlet {

    private AtomicInteger counter = new AtomicInteger(0);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");
        response.getWriter().print(counter.incrementAndGet());
    }
}
