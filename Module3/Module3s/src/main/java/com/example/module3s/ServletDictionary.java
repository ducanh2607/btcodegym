package com.example.module3s;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDictionary", value = "/ServletDictionary")
public class ServletDictionary extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "<head>\n" +
                "  <title>Simple Dictionary</title>\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Vietnamese Dictionary</h2>\n" +
                "<form action = \"ServletDictionarys\" method=\"post\">\n" +
                "  <input type=\"text\" name=\"txtSearch\" placeholder=\"Enter your word: \"/>\n" +
                "  <input type = \"submit\" id = \"submit\" value = \"Search\"/>\n" +
                "</form>\n" +
                "</body>\n" +
                "</html>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
