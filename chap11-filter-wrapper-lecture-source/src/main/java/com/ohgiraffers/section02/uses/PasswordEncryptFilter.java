package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;


import java.io.IOException;
@WebFilter("/member/*")
public class PasswordEncryptFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest= (HttpServletRequest) servletRequest;
        RequestWrapper requestWrapper=new RequestWrapper(httpServletRequest);

        filterChain.doFilter(requestWrapper,servletResponse);
    }
}
