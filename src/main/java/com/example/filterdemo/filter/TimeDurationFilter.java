package com.example.filterdemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.sql.Time;

@Component
@Order(1)
public class TimeDurationFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        System.out.println( httpServletRequest.getMethod());
        System.out.println(httpServletRequest.getRequestURI());

        long start = System.currentTimeMillis();

        filterChain.doFilter(servletRequest,servletResponse);

        long end = System.currentTimeMillis();

        long duration=end-start;
        System.out.println(duration);
    }
}
