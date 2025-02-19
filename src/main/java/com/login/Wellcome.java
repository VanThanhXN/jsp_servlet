package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/wellcome")
public class Wellcome extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = "";

        for( Cookie c : request.getCookies() ){
            if( c.getName().equals("username") ){
                name = c.getValue();
            }
            out.println("<h1>"+name+"</h1>");
        }
        if (name.equals("")){
            response.sendRedirect("/source_Servlet_war_exploded/login");
        }

    }
}
