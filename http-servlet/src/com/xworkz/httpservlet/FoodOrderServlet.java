package com.xworkz.httpservlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/food",loadOnStartup = 1)
public class FoodOrderServlet extends HttpServlet {
    public FoodOrderServlet(){
        System.out.println("Food order servlet is created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cname=req.getParameter("cname");
        String phone=req.getParameter("phone");
        String address=req.getParameter("address");
        String item=req.getParameter("item");
        String quantity=req.getParameter("quantity");
        String price=req.getParameter("price");
        String payment=req.getParameter("payment");

        System.out.println(cname);
        System.out.println(phone);
        System.out.println(address);
        System.out.println(item);
        System.out.println(quantity);
        System.out.println(price);
        System.out.println(payment);


        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<body>");
        writer.println("<h1 style=color:green>");
        writer.println("Food Ordered Succesfully");
        writer.println("</h1>");
        writer.println("<pre>");
        writer.println("Customer Name: "+cname);
        writer.println("Address: "+address);
        writer.println("Item: "+item);
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

