package com.example.source_servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/form-people")
public class Form_People extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
//        out.println("<form action='add-people' method='post>");
//        out.println("name: <input type=\"text\" name=\"name\"> <br>");
//        out.println("age: <input type=\"text\" name=\"age\"> <br>");
//        out.println("address: <input type=\"text\" name=\"address\"> <br>");
//        out.println("<input type=\"submit\" value=\"Submit\">");
//        out.println("</form>");
        out.println("""
                <!DOCTYPE html>
                <html>
                <head>
                <meta charset="UTF-8">
                <title>Form_People</title>
                </head>
                <body>
                <h2>Enter Person Information</h2>
                <form action="add-people" method="POST">
                
                <label for="name">Name:</label>
                <input type="text" name="name" id="name" required><br><br>

                <label for="age">Age:</label>
                <input type="number" name="age" id="age" required><br><br>

                <label for="address">Address:</label>
                <input type="text" name="address" id="address" required><br><br>

                <input type="submit" value="Submit">
                </form>
                </body>
                </html>
                """);

    }
}
