package com.example.springboothelloworld.helloServlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="helloServlet", urlPatterns = "/helloServlet")
public class helloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        System.out.println("Servlet Running !!!");

    }

}


@WebFilter(filterName = "helloFilter", urlPatterns = "/helloServlet")
public class helloFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException , ServletException {

        System.out.println("Executing Filter method");
        filterChain.doFilter(request, response);
        System.out.println("Filtering done !!");
    }

}
