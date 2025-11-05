package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/personal",loadOnStartup = 1)
public class PersonalInfoServlet extends GenericServlet {
    public PersonalInfoServlet(){
        System.out.println("Personal Info Servlet Created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service....Personal servlet");
        String name= servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String mobileNo=servletRequest.getParameter("mobileNo");
        String age=servletRequest.getParameter("age");
        String address=servletRequest.getParameter("address");
        String gender=servletRequest.getParameter("gender");
        String dob=servletRequest.getParameter("dob");
        String status=servletRequest.getParameter("status");
        String submit=servletRequest.getParameter("submit");

        System.out.println("Personal details");
        System.out.println(name);
        System.out.println(email);
        System.out.println(mobileNo);
        System.out.println(age);
        System.out.println(address);
        System.out.println(gender);
        System.out.println(dob);
        System.out.println(status);
        System.out.println("---------------------------------");

    }
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
