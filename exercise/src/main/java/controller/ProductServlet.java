package controller;


import impl.ProductServiceImpl;
import model.Product;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/products")
public class ProductServlet extends HttpServlet {
    private ProductServiceImpl productService;

    private String message;

    public void init() {
        productService = new ProductServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                create(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            case "find":
                find(request,response);
                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "detail":
                displayDetailProduct(request, response);
                break;
            default:
                displayListProduct(request, response);

        }
    }
    private void displayListProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list-product.jsp");
        request.setAttribute("products", productService.findAll());
        requestDispatcher.forward(request, response);
    }
    private void displayDetailProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Long id = Long.parseLong(request.getParameter("id"));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("detail-product.jsp");
        request.setAttribute("product",productService.findById(id));
        requestDispatcher.forward(request, response);
    }
    private void create(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        String name = request.getParameter("name");
        Double price = Double.parseDouble(request.getParameter("price"));
        Integer quantity = Integer.parseInt(request.getParameter("quantity"));
        productService.save(new Product(name, price, quantity));
        response.sendRedirect("http://localhost:808/products");

    }
    private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Long id  = Long.parseLong(request.getParameter("id"));
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("delete-product.jsp");
        request.setAttribute("products", productService.deleteById(id));
        request.setAttribute("message","Delete successfully.");
        requestDispatcher.forward(request, response);

    }
    private void find(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        List<Product>productList = productService.findByNameContaining(name);
        render(request, response, productList);
    }

    private void render(HttpServletRequest request, HttpServletResponse response, List<Product> productList) throws IOException, ServletException{
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("list-product.jsp");
        request.setAttribute("products", productList);
        requestDispatcher.forward(request,response);
    }
}