package com.ohgiraffers.section02.uses;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/member/regist")
public class RegistMemberServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId=request.getParameter("userId");
        String password=request.getParameter("password");
        String name=request.getParameter("name");
        System.out.println("userId:"+userId);
        System.out.println("password:"+password);
        System.out.println("name:"+name);
        PrintWriter out=response.getWriter();
        out.println("<!doctype html>");
        out.println("<html>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h3>"+name+"regin </h3>");
        out.println("</body>");
        out.println("</html>");

        out.flush();
        out.close();





    }
}
