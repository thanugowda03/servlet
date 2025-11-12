package com.xworkz.httpservlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/blood",loadOnStartup = 1)
public class BloodBookingServlet extends HttpServlet {
    public BloodBookingServlet(){
        System.out.println("Blood booking servlet is created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String pname=req.getParameter("pname");
        String age=req.getParameter("age");
        String gender=req.getParameter("gender");
        String bloodGroup=req.getParameter("bloodGroup");
        String hname=req.getParameter("hname");
        String submit=req.getParameter("submit");

        System.out.println(pname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(bloodGroup);
        System.out.println(hname);

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<body>");
        writer.println("<h1 style=color:green>");
        writer.println("Blood Booked Succesfully");
        writer.println("</h1>");
        writer.println("<pre>");
        writer.println("Patient Name: "+pname);
        writer.println("Blood Group: "+bloodGroup);
        writer.println("Hospital Name: "+hname);
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
