package com.xworkz.coffee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/land",loadOnStartup = 1)
public class CoffeeLandServlet extends HttpServlet {

    public CoffeeLandServlet(){
        System.out.println("Coffee Land servlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost in coffee servlet ");String size=req.getParameter("size");
       String plants=req.getParameter("plants");
       String yield=req.getParameter("yield");
       String expenditure=req.getParameter("expenditure");
       String profit=req.getParameter("profit");
       String fertilizer=req.getParameter("fertilizer");

        req.setAttribute("size",size);
        req.setAttribute("plants",plants);
        req.setAttribute("yield",yield);
        req.setAttribute("expenditure",expenditure);
        req.setAttribute("profit",profit);
        req.setAttribute("fertilizer",fertilizer);
        req.getRequestDispatcher("CoffeeLandResult.jsp").forward(req,resp);
        System.out.println("after request forward");


    }
}

