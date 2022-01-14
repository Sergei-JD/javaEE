package com.javaee.example.servlets.include;

import com.javaee.example.additionally.RequestDto;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
