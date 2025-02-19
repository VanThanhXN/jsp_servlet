package com.example1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cooki1")
public class Cooki1 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("chao dai ca");

        Cookie cookie = new Cookie("name", "hi guys");
        cookie.setMaxAge(5);
        response.addCookie(cookie);

        Cookie cookie2 = new Cookie("age", "22");
        cookie2.setMaxAge(10);
        response.addCookie(cookie2);




    }
}
