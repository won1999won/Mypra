package com.ohgiraffers.section01.qurreyString;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.Date;

@WebServlet("/querystring")
public class QurreyStringTestServlet extends HttpServlet {
//    톰켓 서블릿 컨테이너가 요청 url로 매핑된 서블릿 클래스의 인스턴스를 생성하여 서비스 메소드를 호출학
//    Http 서블릿을 상속받아 오버라이딩한 형재클래스의 doGET 메소드가 동적 바인딩에 의해 호출된다
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name=request.getParameter("name");
        System.out.println("name:"+name);
        int age= Integer.parseInt(request.getParameter("age"));
        System.out.println("age:"+age);
        java.sql.Date birthday= Date.valueOf(request.getParameter("birthday"));
        System.out.println("birthday:"+birthday);
        String gender=request.getParameter("gender");
        System.out.println("gender:"+gender);
        String national=request.getParameter("national");
        System.out.println("national:"+national);

        String[] hobbies= request.getParameterValues("hobbies");
        System.out.println("hobbies:");
        for (String hobby:hobbies){
            System.out.println(hobby+" ");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
