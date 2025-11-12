package com.xworkz.httpservlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/product",loadOnStartup = 1)
public class ECommerceProductServlet extends HttpServlet {
    public ECommerceProductServlet(){
        System.out.println("E-Commerce servlet is created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String brand=req.getParameter("brand");
        String price=req.getParameter("price");
        String quantity=req.getParameter("quantity");
        String category=req.getParameter("category");
        String payment=req.getParameter("payment");
        String submit=req.getParameter("submit");

        System.out.println(name);
        System.out.println(category);
        System.out.println(brand);
        System.out.println(price);
        System.out.println(payment);
        System.out.println(quantity);
        System.out.println(submit);

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<body>");
        writer.println("<h1 style=color:green>");
        writer.println("Product Booked Successfully");
        writer.println("</h1>");
        writer.println("</html>");
        writer.println("<pre>");
        writer.println("Product name: "+name);
        writer.println("Brand: "+brand);
        writer.println("Quantity: "+quantity);
        writer.println("<pre>");
        writer.println("</body>");
        writer.println("</head>");
        writer.println("</html>");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
