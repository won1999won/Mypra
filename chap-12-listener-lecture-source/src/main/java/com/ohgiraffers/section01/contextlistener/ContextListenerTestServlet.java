package com.ohgiraffers.section01.contextlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/context")
public class ContextListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ContextListener 확인");
        ServletContext context= request.getServletContext();
//        콘텍스트에 attr을 추가하면attributeAssed()메소드 동작
        context.setAttribute("test","value");
//        동일 키에 다른값을 넣으면 attributeReplace()메소드 동작
        context.setAttribute("test","value2");
//        콘텍스트에 attr을 제거하면 atributeRemuved()메소드 동작
        context.removeAttribute("test");
    }

}
