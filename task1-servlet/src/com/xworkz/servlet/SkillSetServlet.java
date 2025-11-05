package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/skill",loadOnStartup = 1)
public class SkillSetServlet extends GenericServlet {
    public SkillSetServlet(){
        System.out.println("Skill Set Servlet created");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service.....Skillset Servlet");
        String name=servletRequest.getParameter("name");
        String email=servletRequest.getParameter("email");
        String primarySkill=servletRequest.getParameter("primarySkill");
        String secondarySkill=servletRequest.getParameter("secondarySkill");
        String database=servletRequest.getParameter("database");
        String ide=servletRequest.getParameter("ide");
        String ui=servletRequest.getParameter("ui");
        String exp=servletRequest.getParameter("exp");
        String frameworks=servletRequest.getParameter("frameworks");
        String other=servletRequest.getParameter("other");
        String submit=servletRequest.getParameter("submit");

        System.out.println("Skillset");
        System.out.println(name);
        System.out.println(email);
        System.out.println(primarySkill);
        System.out.println(secondarySkill);
        System.out.println(database);
        System.out.println(ide);
        System.out.println(ui);
        System.out.println(exp);
        System.out.println(frameworks);
        System.out.println(other);
        System.out.println("-----------------------------");


    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
