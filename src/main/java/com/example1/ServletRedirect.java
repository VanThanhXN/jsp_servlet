package com.example1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/chuyen-huong")
public class ServletRedirect extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.sendRedirect("/source_Servlet_war_exploded/a");
        response.setStatus(response.SC_MOVED_TEMPORARILY);
        response.setHeader("Location","/source_Servlet_war_exploded/a");

    }
}
