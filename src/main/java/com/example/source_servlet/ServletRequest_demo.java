package com.example.source_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;


@WebServlet("/servlet-request")
public class ServletRequest_demo  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("phuong thu" + request.getMethod());
        request.getContentType();
        request.getContextPath();
        System.out.println("phuong thu" + request.getServletPath());
        System.out.println("phuong thu" + request.getServerName());

        Enumeration<String> headerNames = request.getHeaderNames();

        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            System.out.println("phuong thu" + headerName);
        }
    }
}
