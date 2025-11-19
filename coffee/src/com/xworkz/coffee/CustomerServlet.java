package com.xworkz.coffee;

import com.xworkz.coffee.DTO.CustomerDTO;
import com.xworkz.coffee.Impl.CustomerServiceImpl;
import com.xworkz.coffee.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/customer",loadOnStartup = 1)
public class CustomerServlet extends HttpServlet {
    public CustomerServlet(){
        System.out.println("Customer servlet is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {String name=req.getParameter("name");
        System.out.println("Running doPost in coffee servlet ");
        String customer=req.getParameter("customer");
        String mobile=req.getParameter("mobile");
        String flavour=req.getParameter("flavour");
        String quantity=req.getParameter("quantity");
        String payment=req.getParameter("payment");
        System.out.println("req process is done");


        req.setAttribute("customer",customer);
        req.setAttribute("mobile",mobile);
        req.setAttribute("flavour",flavour);
        req.setAttribute("quantity",quantity);
        req.setAttribute("payment",payment);


        CustomerDTO customerDTO=new CustomerDTO(customer, mobile, flavour, quantity, payment);
        System.out.println("CustomerDTO--->"+customerDTO);

        CustomerServiceImpl customerServiceImpl=new CustomerServiceImpl();
        req.getRequestDispatcher("CustomerResult.jsp").forward(req,resp);
        System.out.println("after request forward");
    }
    }

