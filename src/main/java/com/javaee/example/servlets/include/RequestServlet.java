package com.javaee.example.servlets.include;

import com.javaee.example.additionally.RequestDto;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import util.JspHelper;

import java.io.IOException;

@WebServlet(name = "RequestServlet", value = "/RequestServlet")
public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("request2022", new RequestDto("Some description", "2022-01-14"));
        getServletContext()
                .getRequestDispatcher(JspHelper.getPath("request"))
                .forward(request, response);
    }
}
