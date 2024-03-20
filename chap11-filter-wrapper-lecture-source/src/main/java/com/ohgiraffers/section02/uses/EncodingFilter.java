package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class EncodingFilter implements Filter {
    private String encodingType;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        encodingType=filterConfig.getInitParameter("encoding-type");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse=(HttpServletResponse) servletResponse;
        httpServletResponse.setContentType((encodingType));
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
