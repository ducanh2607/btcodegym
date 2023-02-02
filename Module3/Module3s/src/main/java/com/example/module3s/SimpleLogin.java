package com.example.module3s;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleLogin", value = "/SimpleLogin")
public class SimpleLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<style type=\"text/css\">\n" +
                "  .login {\n" +
                "    height:180px; width:253px;\n" +
                "    margin:0;\n" +
                "    padding:10px;\n" +
                "    border:1px #CCC solid;\n" +
                "  }\n" +
                "  .login input {\n" +
                "    padding:5px; margin:5px\n" +
                "  }\n" +
                "</style>\n" +
                "<body>\n" +
                "<form action = \"ServletLogin\" method = \"post\">\n" +
                "  <div class=\"login\">\n" +
                "    <h2>Login</h2>\n" +
                "    <input type=\"text\" name=\"username\" size=\"30\"  placeholder=\"username\" />\n" +
                "    <input type=\"password\" name=\"password\" size=\"30\" placeholder=\"password\" />\n" +
                "    <input type=\"submit\" value=\"Sign in\"/>\n" +
                "  </div>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
