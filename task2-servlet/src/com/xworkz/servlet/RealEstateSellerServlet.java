package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/seller", loadOnStartup = 1)
public class RealEstateSellerServlet extends GenericServlet {
    public RealEstateSellerServlet(){
        System.out.println("Real estate servlet for seller is created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service....Real estate seller servlet");
        String sellerId=servletRequest.getParameter("sellerId");
        String name=servletRequest.getParameter("name");
        String age=servletRequest.getParameter("age");
        String gender=servletRequest.getParameter("gender");
        String contactNo=servletRequest.getParameter("contactNo");
        String address=servletRequest.getParameter("address");
        String type=servletRequest.getParameter("type");
        String propAddress=servletRequest.getParameter("propAddress");
        String value=servletRequest.getParameter("value");
        String owner=servletRequest.getParameter("owner");
        String agent=servletRequest.getParameter("agent");
        String submit=servletRequest.getParameter("submit");

        System.out.println("Real estate seller details");
        System.out.println(sellerId);
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(contactNo);
        System.out.println(address);
        System.out.println(type);
        System.out.println(propAddress);
        System.out.println(value);
        System.out.println(owner);
        System.out.println(agent);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
