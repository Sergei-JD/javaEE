package com.javaee.example.servlets.parameters;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ParameterNameServlet", value = "/ParameterNameServlet")
public class ParameterNameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Hello, " + firstName + " " + lastName + " </h1>");
        pw.println("</html>");
    }
}
