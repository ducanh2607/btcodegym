package com.example.module3s1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "CharacterServlet", value = "/CharacterServlet")
public class CharacterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Character> characters = new ArrayList<>();
        characters.add(new Character("luffy", "1983-08-20", "brazil", "img.png"));
        characters.add(new Character("zoro", "1983-08-21", "japan", "img_1.png"));
        characters.add(new Character("sanji", "1983-08-22", "japan", "img_2.png"));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("character.jsp");
        request.setAttribute("characters", characters);
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
        request.setAttribute("test", name);
        requestDispatcher.forward(request, response);

        response.sendRedirect("index.jsp");
    }
}
