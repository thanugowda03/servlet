package com.xworkz.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/education",loadOnStartup = 1)
public class EducationDetailsServlet extends GenericServlet {
    public EducationDetailsServlet(){
        System.out.println("Education Details Servlet created ");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Running service......Education details servlet");

        String sname=servletRequest.getParameter("sname");
        String school=servletRequest.getParameter("school");
        String yop=servletRequest.getParameter("yop");
        String percentage=servletRequest.getParameter("servlet");

        String name=servletRequest.getParameter("name");
        String college=servletRequest.getParameter("college");
        String year=servletRequest.getParameter("year");
        String percent=servletRequest.getParameter("percent");

        String studName=servletRequest.getParameter("studName");
        String clg=servletRequest.getParameter("clg");
        String course=servletRequest.getParameter("course");
        String stream=servletRequest.getParameter("stream");
        String passout=servletRequest.getParameter("passout");
        String percentage1=servletRequest.getParameter("percentage1");

        String stName=servletRequest.getParameter("stName");
        String clgg=servletRequest.getParameter("clgg");
        String course1=servletRequest.getParameter("course1");
        String stream1=servletRequest.getParameter("stream1");
        String passoutYear=servletRequest.getParameter("passoutYear");
        String percentage2=servletRequest.getParameter("percentage2");

        String submit=servletRequest.getParameter("submit");

    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }
}
