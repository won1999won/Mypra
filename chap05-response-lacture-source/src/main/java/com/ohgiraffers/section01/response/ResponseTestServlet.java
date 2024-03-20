package com.ohgiraffers.section01.response;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        서블릿이 하는 역할 3개
//        요청받기-http method GEt/Post 요청에따라 parameter로 전달받은 데이터를 꺼내올수있다
//        비지니스 로직처리-DB접속과 CRUD에 대한 로직처리
//        응답하기-문자열로 동적인 웹(Html)페이지를 만들고 스트림을 이용해 내보낸다

        PrintWriter out= response.getWriter();

//        문자열을 이용해 사용자에게 내보낼 페이지 작성
        StringBuilder responsebuilder=new  StringBuilder();
        responsebuilder.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>hello servlet response</h1>\n")
                .append("</body>\n")
                .append("</html>\n");
//        content-type 헤더의 값은 null이 기본값이며 명시하지않으면 text/plain으로 설정
        System.out.println("default response type:"+response.getContentType());
        response.setContentType("text/html");
//        System.out.println(request.getCharacterEncoding());
//        스트림을 이용해 내보내기
        out.print(responsebuilder.toString());
//        버퍼 잔여물 제거
        out.flush();
//        스트림 닫기
        out.close();
    }

}
