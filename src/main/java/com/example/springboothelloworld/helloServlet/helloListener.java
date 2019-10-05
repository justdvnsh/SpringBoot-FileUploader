package com.example.springboothelloworld.helloServlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class helloListener implements ServletContextListener {

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

        System.out.println("Servlet Context Destroyed");

    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        System.out.println("Servlet Context Initialized");

    }

}
