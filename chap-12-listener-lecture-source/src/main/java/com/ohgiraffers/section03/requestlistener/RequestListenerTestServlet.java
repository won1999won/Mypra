package com.ohgiraffers.section03.requestlistener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/request")
public class RequestListenerTestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("username","sion");
        request.setAttribute("age",20);
        request.setAttribute("job","eater");
        request.setAttribute("username","mion");
        request.removeAttribute("age");
    }

}
