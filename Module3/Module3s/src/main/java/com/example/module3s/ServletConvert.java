package com.example.module3s;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletConvert", value = "/ServletConvert")
public class ServletConvert extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<html>\n" +
                "<head>\n" +
                "  <title>Currency Converter</title>\n" +
                "  <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<h2>Currency Converter</h2>\n" +
                "<form action=\"ServletConvert\" method=\"post\">\n" +
                "  <label>Rate: </label><br/>\n" +
                "  <input type=\"text\" name=\"rate\" placeholder=\"RATE\" value=\"22000\"/><br/>\n" +
                "  <label>USD: </label><br/>\n" +
                "  <input type=\"text\" name=\"usd\" placeholder=\"USD\" value=\"0\"/><br/>\n" +
                "  <input type = \"submit\" id = \"submit\" value = \"Converter\"/>\n" +
                "</form>\n"
                );
        writer.println("</body>");
        writer.print("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate * usd;
        PrintWriter writer = response.getWriter();
        writer.println("Rate: " +  rate );
        writer.println("USD: " + usd  );
        writer.println("VND: " + vnd );

    }
}
