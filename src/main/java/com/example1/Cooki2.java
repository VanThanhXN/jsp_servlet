package com.example1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cooki2")
public class Cooki2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies ) {
            out.println( c.getName() + c.getValue() + "<br>");

//            if (c.getName().equals("name")) {
//                c.setMaxAge(0);
//                response.addCookie(c);
//            }
        }
    }
}
