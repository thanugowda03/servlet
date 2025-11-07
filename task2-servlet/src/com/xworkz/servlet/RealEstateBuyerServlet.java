package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/buyer",loadOnStartup = 1)
public class RealEstateBuyerServlet extends GenericServlet {
    public RealEstateBuyerServlet(){
        System.out.println("Real Estate Servlet for buyer is created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service.....Real Estate Servlet");
        String buyerId=servletRequest.getParameter("buyerId");
        String name=servletRequest.getParameter("name");
        String age=servletRequest.getParameter("age");
        String gender=servletRequest.getParameter("gender");
        String contactNo=servletRequest.getParameter("contactNo");
        String address=servletRequest.getParameter("address");
        String type=servletRequest.getParameter("type");
        String budget=servletRequest.getParameter("budget");
        String location=servletRequest.getParameter("location");
        String agent=servletRequest.getParameter("agent");
        String submit=servletRequest.getParameter("submit");

        System.out.println("Real Estate Buyer Details");
        System.out.println(buyerId);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(contactNo);
        System.out.println(address);
        System.out.println(type);
        System.out.println(budget);
        System.out.println(location);
        System.out.println(agent);

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("Data saved successfully........"+buyerId+" , "+name+" , "+age+" , "+gender+" , "+contactNo+" , "+address+" , "+
                type+" , "+budget+" , "+location+" , "+agent);

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
