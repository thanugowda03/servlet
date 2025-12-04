package com.xworkz.event;

import DTO.EventDTO;
import Service.EventImpl;
import Service.EventRegistrationService;
import com.xworkz.event.exception.DataInvalidException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/event",loadOnStartup = 1)
public class EventServlet extends HttpServlet {
    private EventRegistrationService eventRegistrationService=new EventImpl();

    public EventServlet() {
        System.out.println("Event servlet is created");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost in event servlet");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String type = req.getParameter("type");
        String city = req.getParameter("city");
        try {
            EventDTO eventDTO = new EventDTO(name, email, phone, type, city);
            System.out.println("EventDto-->"+eventDTO);
            eventRegistrationService.validateAndSave(eventDTO);


            req.setAttribute("name", name);
            req.setAttribute("email", email);
            req.setAttribute("phone", phone);
            req.setAttribute("type", type);
            req.setAttribute("city", city);


            req.getRequestDispatcher("EventRegistration.jsp").forward(req, resp);
            System.out.println("after request forward");


        } catch (DataInvalidException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("EventRegistration.html").forward(req,resp);
    }
}
