package com.ohgiraffers.forward;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/forward")
public class ReceivelnformationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String userId = request.getParameter("userId");
        String password = request.getParameter("password");
        System.out.println("userId:" + userId);
        System.out.println("password:" + password);
//        어떤 서블릿으로 위임할것인지 대상서블릿을 지정하는 인스턴스를 생성하고
//        forward()메소드를 통해 요청과 응답에 대한 정보를 전달하여 나머지 작읍을 수행하도록 위임한다
//        이때 다은 서블릿으로 요ㅈ청하기위한 데이터는 리퀘스트에 setAttribute()로 전달해서
//        받는 쪽에서 getAttribute()로꺼내쓴다
        request.setAttribute("userId", userId);
        RequestDispatcher re = request.getRequestDispatcher("print");
        re.forward(request, response);
    }
}
