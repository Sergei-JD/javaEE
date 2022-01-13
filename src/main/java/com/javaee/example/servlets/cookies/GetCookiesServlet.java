package com.javaee.example.servlets.cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

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
