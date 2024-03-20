package com.ohgiraffers.section01.session;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/session")
public class SessionHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");

        System.out.println("firstname:"+firstName);
        System.out.println("lastname:"+lastName);

//        HttpSession 은 직접 생성할수없고 request내 getSession으로 리턴
        HttpSession sessions=request.getSession();

        System.out.println("sessionId:"+sessions.getId());
//        기본 유지시간 30분
        System.out.println("session default 유지시간:"+sessions.getMaxInactiveInterval());
        sessions.setMaxInactiveInterval(60*10); //10분
        System.out.println("변경후 유지시간:"+sessions.getMaxInactiveInterval());

        sessions.setAttribute("firstName",firstName);
        sessions.setAttribute("lastName",lastName);

        response.sendRedirect("redirect");


    }
}
