package com.xworkz.httpservlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/flight",loadOnStartup = 1)
public class FlightTicketServlet extends HttpServlet {

    public FlightTicketServlet(){
        System.out.println("Flight server servlet created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


      String pname=req.getParameter("pname");
      String age=req.getParameter("age");
      String gender=req.getParameter("gender");
      String source=req.getParameter("source");
      String destination=req.getParameter("destination");
      String price=req.getParameter("price");
      String payment=req.getParameter("payment");
      String submit=req.getParameter("submit");

        System.out.println(pname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(source);
        System.out.println(destination);
        System.out.println(price);
        System.out.println(payment);

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<body>");
        writer.println("<h1 style=color:green>");
        writer.println("Flight Ticket Booked Succesfully");
        writer.println("</h1>");
        writer.println("<pre>");
        writer.println("Passenger Name: "+pname);
        writer.println("Age: "+age);
        writer.println("Source: "+source);
        writer.println("Destination: "+destination);
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
