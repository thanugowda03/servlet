package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/license",loadOnStartup = 1)
public class DrivingLicenseServlet extends GenericServlet {
    public DrivingLicenseServlet(){
        System.out.println("Driving License Servlet is Created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running servlet....Driving License");
        String firstName=servletRequest.getParameter("firstName");
        String lastName=servletRequest.getParameter("lastName");
        String fatherName=servletRequest.getParameter("fatherName");
        String dob=servletRequest.getParameter("dob");
        String age=servletRequest.getParameter("age");
        String gender=servletRequest.getParameter("gender");
        String bloodGroup=servletRequest.getParameter("bloodGroup");
        String mobileNo=servletRequest.getParameter("mobileNo");
        String email=servletRequest.getParameter("email");
        String aadhar=servletRequest.getParameter("aadhar");
        String address=servletRequest.getParameter("address");
        String pincode=servletRequest.getParameter("pincode");
        String vehicleType=servletRequest.getParameter("vehicleType");
        String licenseType=servletRequest.getParameter(" licenseType");
        String rto=servletRequest.getParameter("rto");
        String submit=servletRequest.getParameter("submit");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(fatherName);
        System.out.println(dob);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(bloodGroup);
        System.out.println(mobileNo);
        System.out.println(email);
        System.out.println(aadhar);
        System.out.println(address);
        System.out.println(pincode);
        System.out.println(vehicleType);
        System.out.println(licenseType);
        System.out.println(rto);
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
