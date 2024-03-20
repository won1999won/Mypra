package com.ohgiraffers.section01.section02.delete;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/delete")
public class DeleteSessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session= request.getSession();
        System.out.println("redirect session id:"+session.getId());
        Enumeration<String> sessionName= session.getAttributeNames();
        while (sessionName.hasMoreElements()){
            System.out.println(sessionName.nextElement());
        }
//        세션데이터 삭제
//        1.설정시간이 지나면 삭제
//        2.removeAttribute()로 세션의 어트리뷰트삭제
//        3.invalidate()를 호출시 모두 제거
        System.out.println("-------------");
        session.removeAttribute("firstName");
        sessionName= session.getAttributeNames();
        while (sessionName.hasMoreElements()){
            System.out.println(sessionName.nextElement());
        }
        System.out.println("---------------");
        session.invalidate();
//        invalidate하면 세션 자체가 무효화 즉 세션내 데이터를 지우는것뿐만아니라 세션자체를 없앤다 고로 이 이후 세션은 이용불가
        sessionName= session.getAttributeNames();
        while (sessionName.hasMoreElements()){
            System.out.println(sessionName.nextElement());
        }



    }

}
