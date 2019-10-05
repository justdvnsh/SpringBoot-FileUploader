package com.example.springboothelloworld;

import com.example.springboothelloworld.helloServlet.helloFilter;
import com.example.springboothelloworld.helloServlet.helloListener;
import com.example.springboothelloworld.helloServlet.helloServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.logging.Filter;

@SpringBootApplication
public class SpringBootHelloworldApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootHelloworldApplication.class, args);

	}

	/// Register Servlet
	@Bean
	public ServletRegistrationBean getServletRegistrationBean() {

		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new helloServlet());
		servletRegistrationBean.addUrlMappings("/helloServlet");
		return servletRegistrationBean;

	}

	/// Regiter Filter
	@Bean
	public FilterRegistrationBean getFilterRegistrationBean() {

		FilterRegistrationBean filterBean = new FilterRegistrationBean(new helloFilter());
		filterBean.addUrlPatterns("/helloServlet");
		return filterBean;

	}

	@Bean
	public ServletListenerRegistrationBean<helloListener> getServletListenerBean() {

		ServletListenerRegistrationBean listenerBean = new ServletListenerRegistrationBean(new helloListener());
		return listenerBean;

	}

}
