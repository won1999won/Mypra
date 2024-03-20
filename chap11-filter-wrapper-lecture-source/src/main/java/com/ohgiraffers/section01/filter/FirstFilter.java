package com.ohgiraffers.section01.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
@WebFilter("/first/*")
public class FirstFilter implements Filter {
    public FirstFilter() {
        System.out.println("FF ON");
    }
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FF init()method call");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        servlet으로 리퀘스트로 전달되기전에 요청을 가로채는 메소드
        System.out.println("F doFilter() method call");
//        필터에서 처리할 코드
//        필터 처리 이후 다음 필터 또는 서블릿의 doGet/doPost호출
        filterChain.doFilter(servletRequest,servletResponse);
//        서블릿실행후 수행내용
        System.out.println("doFilter() end servlet complete");

    }

    @Override
    public void destroy() {
        System.out.println("F destroy() call");
    }
}
