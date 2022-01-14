package com.javaee.example.servlets.parameters;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "ParametersEnumServlet", value = "/ParametersEnumServlet")
public class ParametersEnumServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> parametersNames = request.getParameterNames();

        while (parametersNames.hasMoreElements()) {
            String parametersKey = parametersNames.nextElement();
            System.out.println(request.getParameter(parametersKey));
        }
    }

}
