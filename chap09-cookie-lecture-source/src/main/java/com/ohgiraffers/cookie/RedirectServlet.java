package com.ohgiraffers.cookie;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName=request.getParameter("firstName");
        String lastName=request.getParameter("lastName");

//        리다이렉트시 이전요청 정보는 존재하지않는다= 리퀘스트가 공유되지않으므로 null값
//        쿠키쓰는법
//        1.리퀘스트에서 쿠키목록을 쿠키의 배열형태로 꺼냄
//        2.쿠키에 getName getvalue를 이용해 쿠키에 담긴 값을 사용
        Cookie[] cookies= request.getCookies();
        for (int i=0;i<cookies.length;i++){
            System.out.println("[cookie]"+cookies[i].getName()+":"+cookies[i].getValue());
            if ("firstName".equals(cookies[i].getName())){
                firstName=cookies[i].getValue();
            } else if ("lastName".equals(cookies[i].getName())){
                lastName=cookies[i].getValue();

            }
        }
        StringBuilder retext=new StringBuilder();
        retext.append("<!doctype html>")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3> first name:")
                .append(firstName)
                .append("last name:")
                .append(lastName)
                .append("</h3>")
                .append("</body>\n")
                .append("</html>\n");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print(retext.toString());
        out.flush();
        out.close();
    }

}
