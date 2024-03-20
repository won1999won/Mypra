package com.ohgiraffers.section01.servicemethod;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/request-service")
public class servicemethodtestservlet extends HttpServlet {

    //    HTTP를 대체할 프로토콜이 존재한다면 HttpServletRequest는 다른 클래스로 대체되어야한다
//    따라서 ServletRequest라는 추항화 타입으로 사용하고 실제 인스턴스는 HttpServletRequest로 사용하며
//    나중에 service method의 인자타입은 변형하지않고 다른 프로토콜을 사용하는 Request로 변형이 가능하다(다형셩)
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        현재 사용되는 프로토콜은 HTTP프로토콜로 HttpServletRequest타입이다
//        HttpServletRequest는 SerletRequest를 상속받아 구현했으며 Http프로토콜의 정보를 담고있으므로 실제사용시 다운캐스팅필요
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        HttpServletResponse httpServletResponse = (HttpServletResponse) res;

//        요청받은 http메소드가 어떤 메소드인지 판단
        String httpMethod = httpServletRequest.getMethod();
//요청내용 출력
        System.out.println("httpMethod" + httpMethod);
        if("GET".equals(httpMethod)){
//            get요청을 처리할 메소드로 요청과 응답정보를 전달
            doGet(httpServletRequest,httpServletResponse);
        }else {
//            POST요청을 처리할 메소드로 요청과 응답정보를 전달
            doPost(httpServletRequest,httpServletResponse);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("get요청 처리메소드 호출");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post요청 처리메소드 호출");
    }
}
