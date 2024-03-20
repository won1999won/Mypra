package com.ohgiraffers.cookie;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        System.out.println("firstName:" + firstName);
        System.out.println("lastName:" + lastName);
//        response.sendRedirect("redirect");

//        [쿠키사용법]
//        1.쿠키 생성
//        2.쿠키의 만료시간 설정
//        3.응답 헤더에 쿠키전달
//        4.응답보내기

//        [쿠키제약사항]
//        이름은 ascii문자만을 사용해야하며 한번 설정한 이름은 변경불가
//        이름에 공백과 일부 특수문자([] () = , " \ ? @ : ;)사용불가
        Cookie fName = new Cookie("firstName", firstName);
        Cookie lName = new Cookie("lastName", lastName);

        fName.setMaxAge(60 * 60 * 24); //초단위 설정
        lName.setMaxAge(60 * 60 * 24);
        response.addCookie(fName);
        response.addCookie(lName);

        response.sendRedirect("redirect");
    }
}
