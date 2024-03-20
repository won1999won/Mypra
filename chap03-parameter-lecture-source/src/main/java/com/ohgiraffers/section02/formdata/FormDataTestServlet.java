package com.ohgiraffers.section02.formdata;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@WebServlet("/formdata")
public class FormDataTestServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("name");
        System.out.println("name:"+name);
        Map<String,String[]> requestParameterMap= request.getParameterMap();
        Set<String>keySet=requestParameterMap.keySet();
        Iterator<String>keyIter= keySet.iterator();
        while (keyIter.hasNext()){
            String key= keyIter.next();
            String[] value=requestParameterMap.get(key);
            for (int i=0;i<value.length;i++){
                System.out.println("value["+i+"]"+value[i]);
            }
        }
//        Iterator & Enumeration
//        Iterator:반복자란뜻의 인터페이스로 자료를 얻기위해 사용
//        -hasNext():다음 데이터가 있으면 true 없으면 false
//        -next():자료구조의 다음데이터 반환
//        -remove():현재 조회하는 객체의 레퍼런스 삭제

//        Enumeration:Iterator와 유사한 반복자
//        -hasMoreElements():다음 데이터가 있으면 true 없으면 false
//        -nextElements:자료구조의 다음데이터 반환
        Enumeration<String> names= request.getParameterNames();
        while (names.hasMoreElements()){
            String key=names.nextElement();
            System.out.println(key);
            String[] value= requestParameterMap.get(key);
            for (String str:value){
                System.out.println(str);
            }
        }


    }
}
