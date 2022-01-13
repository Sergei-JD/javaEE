package com.javaee.example.servlets.cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "DeleteCookiesServlet", value = "/DeleteCookiesServlet")
public class DeleteCookiesServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie cookie = new Cookie("some_id", "");
/*
        value of 0 for this method (setMaxAge) means that cookies are deleted
        from the client's browser immediately
*/
        cookie.setMaxAge(0);
/*
        value -1 for this method (setMaxAge) means that cookies are deleted
        from the client's browser after the browser is closed
*/
//        cookie.setMaxAge(-1);

        response.addCookie(cookie);
    }
}
