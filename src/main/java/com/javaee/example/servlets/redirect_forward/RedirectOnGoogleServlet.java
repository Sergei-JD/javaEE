package com.javaee.example.servlets.redirect_forward;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RedirectOnGoogleServlet", value = "/RedirectOnGoogleServlet")
public class RedirectOnGoogleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Hello, " + name + " </h1>");
        pw.println("</html>");
/*
        the user will not see everything above, but you can perform useful logic,
        for example, saving the user. the user will be redirected to another
        (not internal) resource with a URL change
*/
        response.sendRedirect("https://www.google.com");
    }
}
