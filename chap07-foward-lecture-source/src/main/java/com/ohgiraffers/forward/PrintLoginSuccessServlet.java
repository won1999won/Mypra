package com.ohgiraffers.forward;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/print")
public class PrintLoginSuccessServlet extends HttpServlet {
//    forward받은 서블릿에서도 요청방식이 get이면 doget을 post면 dopost를 호출
//    보내준 서블릿에서 request에 전달정보를 담았으므로 해당서블릿에서 다시 다용하기 위해 request에서 꺼낸다
//    forward할때 전달한 request와 response의 모든 정보를 이용해 새로운 request와 response를 만들고 그 정보를 이용해 다시 http메소드에 맞는 서블릿의 메소드를 호출하는 방식
//    깊은 복사를 이용해 값을 복사하기에 내부 헤더종보나 인스턴스는 그대로 유지한다
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String usetId= (String) request.getAttribute("userId");
        StringBuilder responseText=new StringBuilder();
        responseText.append("<!doctype html>")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3 align=\"center\">")
                .append(usetId)
                .append("wellcom<h3>")
                .append("</body>\n")
                .append("</html>\n");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print(responseText.toString());
        out.flush();
        out.close();
    }
}
