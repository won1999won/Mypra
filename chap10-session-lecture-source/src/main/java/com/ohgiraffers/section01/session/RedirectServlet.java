package com.ohgiraffers.section01.session;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        세션 객체 꺼내기
        HttpSession session= request.getSession();
        System.out.println("redirect session id:"+session.getId());
//        세션에 담긴 모든 Attribute 키 목록 반환
       Enumeration<String> sessionName= session.getAttributeNames();
        while (sessionName.hasMoreElements()){
            System.out.println(sessionName.nextElement());
        }
//        setAttrybute값을 get으로 꺼내기
        String fname= (String) session.getAttribute("firstName");
        String lname= (String) session.getAttribute("lastName");
        StringBuilder responsebulder=new StringBuilder();
        responsebulder.append("<!doctype html>")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h3> first name:")
                .append(fname)
                .append("last name:")
                .append(lname)
                .append("</h3>")
                .append("</body>\n")
                .append("</html>\n");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print(responsebulder.toString());
        out.flush();
        out.close();
    }

}
