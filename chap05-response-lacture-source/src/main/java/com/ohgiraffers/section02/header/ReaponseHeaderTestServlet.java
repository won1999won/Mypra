package com.ohgiraffers.section02.header;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Iterator;

@WebServlet("/headers")
public class ReaponseHeaderTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setHeader("Refresh","1");
      PrintWriter out= response.getWriter();
      long currentTime=System.currentTimeMillis();
      out.print("<h1>"+currentTime+"</h1>");
      out.close();
        Collection<String> responsHeader=response.getHeaderNames();
        Iterator<String> iter= responsHeader.iterator();
        while (iter.hasNext()){
            String haaderName=iter.next();
            System.out.println(haaderName+":"+request.getHeader(haaderName));
        }
    }

}
