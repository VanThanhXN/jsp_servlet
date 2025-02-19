package com.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/wellcome-session")
public class Wellcomesession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession(false); // Không tạo session mới nếu chưa có
        if (session == null || session.getAttribute("username") == null) {
            resp.sendRedirect(req.getContextPath() + "/session-login");
            return;
        }

        String name = (String) session.getAttribute("username");

        out.println("Chào " + name);
        out.println("<br><a href='" + req.getContextPath() + "/logout'>LOG-OUT</a>");
    }
}
