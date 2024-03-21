package com.ohgiraffers.menu.controller;

import com.ohgiraffers.menu.model.service.controller.MenuPriceCalcullator;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
@WebServlet("/menu/oder")
public class MenuOderServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String menuName=request.getParameter("menuName");
        int amount= Integer.parseInt(request.getParameter("amount"));
        System.out.println("menuname:"+menuName);
        System.out.println("amount:"+amount);
        int oderprice=new MenuPriceCalcullator().calcOrderPrice(menuName,amount);
        request.setAttribute("menuName",menuName);
        request.setAttribute("amound",amount);
        request.setAttribute("oderprice",oderprice);
       RequestDispatcher requestDispatcher=request.getRequestDispatcher("/jsp/5_response.jsp");
       requestDispatcher.forward(request,response);

    }
}
