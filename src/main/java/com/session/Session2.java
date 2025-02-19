package com.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/session2")
public class Session2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name ="";
        HttpSession session = req.getSession();
        Object ojb =session.getAttribute("username");

        if(ojb != null) {
            name = String.valueOf(ojb);
        }else{
            resp.sendRedirect("/source_Servlet_war_exploded/login");
        }
        out.println("xin chao " + name);


    }
}
