package com.xworkz.coffee;

import com.xworkz.coffee.DTO.CafeteriaDTO;
import com.xworkz.coffee.Impl.CafeteriaServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/cafe",loadOnStartup = 1)
public class CafeteriaServlet extends HttpServlet {
    public CafeteriaServlet(){
        System.out.println("Cafeteria Servlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost in coffee servlet ");
        String name=req.getParameter("name");
        String location=req.getParameter("location");
        String type=req.getParameter("type");
        String price=req.getParameter("price");
        String franchise=req.getParameter("franchise");
        String owner=req.getParameter("owner");
        String gst=req.getParameter("gst");
        System.out.println("req process is done");


        req.setAttribute("name",name);
        req.setAttribute("location",location);
        req.setAttribute("type",type);
        req.setAttribute("price",price);
        req.setAttribute("franchise",franchise);
        req.setAttribute("owner",owner);
        req.setAttribute("gst",gst);

        CafeteriaDTO cafeteriaDTO=new CafeteriaDTO(name,location, type, price, franchise, owner, gst);
        System.out.println("CafeteriaDTO--->"+cafeteriaDTO);

        CafeteriaServiceImpl cafeteriaServiceImpl=new CafeteriaServiceImpl();
       // System.out.println("CafeteriaServiceImpl--->"+cafeteriaServiceImpl);
        req.getRequestDispatcher("CafeteriaResult.jsp").forward(req,resp);
        System.out.println("after request forward");
    }
}
