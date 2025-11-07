package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/patient",loadOnStartup = 1)
public class PatientServlet extends GenericServlet {
    public PatientServlet(){
        System.out.println("Patient Servlet is created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service....PatientServlet");
       String id= servletRequest.getParameter("id");
       String name=servletRequest.getParameter("name");
       String age=servletRequest.getParameter("age");
       String gender=servletRequest.getParameter("gender");
       String blood=servletRequest.getParameter("blood");
       String phone=servletRequest.getParameter("phone");
       String address=servletRequest.getParameter("address");
       String disease=servletRequest.getParameter("disease");
       String date=servletRequest.getParameter("date");
       String doctor=servletRequest.getParameter("doctor");
       String submit=servletRequest.getParameter("submit");

        System.out.println("Patient Registration");
        System.out.println("id:" +id);
        System.out.println("Patient name:"+name);
        System.out.println("age:"+age);
        System.out.println("gender:"+gender);
        System.out.println("blood group:"+blood);
        System.out.println("contact no:"+phone);
        System.out.println("address:"+address);
        System.out.println("disease:"+disease);
        System.out.println("date:"+date);
        System.out.println("doctor name:"+doctor);
        System.out.println("----------------------------------");

        servletResponse.setContentType("text/html");
        PrintWriter writer=servletResponse.getWriter();
        writer.println("Data Saved successfully..... "+id+" , "+name+" , "+age+" , "+gender+" , "+blood+" , "+phone+" , "+address+" , "+disease+" , "+date+" , "+doctor);


    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
