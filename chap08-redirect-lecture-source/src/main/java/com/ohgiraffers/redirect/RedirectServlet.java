package com.ohgiraffers.redirect;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("이 서블릿으로 리다이렉트");
        System.out.println(response);
        StringBuilder retext=new StringBuilder();
        retext.append("<!doctype html>")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1> 리다이렉트 성공</h1>")
                .append("</body>\n")
                .append("</html>\n");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.print(retext.toString());
        out.flush();
        out.close();
    }

}
