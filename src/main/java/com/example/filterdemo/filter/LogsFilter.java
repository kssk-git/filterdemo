package com.example.filterdemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;


@Component
@Order(2)
public class LogsFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        System.out.println("logs information");

        System.out.println(httpServletRequest.getMethod() +
                httpServletRequest.getRequestURI());
        System.out.println(httpServletRequest.getHeader("token"));
        filterChain.doFilter(httpServletRequest,httpServletResponse);
        httpServletResponse.setHeader("sheema","sa");
        httpServletResponse.setHeader("user-name","sheema");
        httpServletResponse.getStatus();
        httpServletResponse.setStatus(httpServletResponse.SC_EXPECTATION_FAILED);

    }
}
