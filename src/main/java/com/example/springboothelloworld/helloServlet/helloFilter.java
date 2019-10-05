package com.example.springboothelloworld.helloServlet;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "helloFilter", urlPatterns = "/helloServlet")
public class helloFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("Executing Filter method");
        filterChain.doFilter(request, response);
        System.out.println("Filtering done !!");
    }

}
