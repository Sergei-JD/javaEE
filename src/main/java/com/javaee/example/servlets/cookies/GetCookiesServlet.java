package com.javaee.example.servlets.cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GetCookiesServlet", value = "/GetCookiesServlet")
public class GetCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie [] cookies = request.getCookies();

        PrintWriter pw = response.getWriter();

        pw.println("<html>");

        for (Cookie cookie: cookies) {
            pw.println("<h1>" + cookie.getName() + " : " + cookie.getValue() + "</h1>");

        }

        pw.println("</html>");
    }
}
