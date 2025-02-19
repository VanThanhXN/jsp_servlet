package com.login;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Loginform extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

       out.println("""
               <form action="login" method="post">
               <label for='username'>Username:</label>
               <input type="text" name="username">
               <label for='password'>Password:</label>
               <input type="password" name="password">
               <input type="submit" value="login">
               </form>
               
               """);
       out.close();


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username.equals("admin") && password.equals("123")) {
            Cookie cookie = new Cookie("username", username);
            cookie.setMaxAge(5);
            resp.addCookie(cookie);
            resp.sendRedirect("/source_Servlet_war_exploded/wellcome");

        }else {

            resp.sendRedirect("/source_Servlet_war_exploded/login");
            out.println("sai thong tin");
        }
    }
}
