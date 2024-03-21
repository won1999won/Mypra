package com.ohgiraffers.section02.sessionlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/session")
public class SessionListenerTestSevlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session= request.getSession();
        System.out.println("session ID:"+session.getId());
        session.setAttribute("username","tiga");
        session.setAttribute("age",20);
        session.setAttribute("gender","M");
        session.setAttribute("user",new userDTO("aaa",20,"M"));
        session.setAttribute("username","lion");
        session.removeAttribute("gender");
        session.invalidate();   //만료시 모든어트리뷰트를 삭제

    }

}
