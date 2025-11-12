package com.xworkz.httpservlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/movieticket",loadOnStartup = 1)
public class MovieTicketServlet extends HttpServlet {
    public MovieTicketServlet(){
        System.out.println("Movie Ticket servlet is created");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");
        String movieName=req.getParameter("movieName");
        String showtime=req.getParameter("showtime");
        String noOfTickets=req.getParameter("noOfTickets");
        String payment=req.getParameter("payment");
        String seat=req.getParameter("seat");

        System.out.println(name);
        System.out.println(movieName);
        System.out.println(showtime);
        System.out.println(noOfTickets);
        System.out.println(seat);
        System.out.println(payment);

        resp.setContentType("text/html");
        PrintWriter writer=resp.getWriter();
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<body>");
        writer.println("<h1 style=color:green>");
        writer.println("Movie Ticket Booked Successfully..");
        writer.println("</h1>");
        writer.println("<pre>");
        writer.println("Name: "+name);
        writer.println("Movie Name: "+movieName);
        writer.println("No of Tickets: "+noOfTickets);
        writer.println("Seat No.: "+seat);
        writer.println("</pre>");
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
