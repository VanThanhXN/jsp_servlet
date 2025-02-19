package com.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/session-login")
public class SessionLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("""
                <form action="session-login" method="post">
                <label>Username:</label>
                <input type='text' name='username'>
                <label>Password:</label>
                <input type='password' name='password'>
                <input type="submit" value="Login">
                </form>
                """);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if ("admin".equals(username) && "123".equals(password)) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            resp.sendRedirect(req.getContextPath() + "/wellcome-session");
        } else {
            resp.sendRedirect(req.getContextPath() + "/session-login");
        }
    }
}
