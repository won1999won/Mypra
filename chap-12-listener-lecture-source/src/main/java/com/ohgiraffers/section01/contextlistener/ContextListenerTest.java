package com.ohgiraffers.section01.contextlistener;

import jakarta.servlet.ServletContextAttributeEvent;
import jakarta.servlet.ServletContextAttributeListener;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
/*context->톰캣 컨테이너 자체에 리스너 연결
* ServeltContextListener:웹 어플리 케이션의 시작 종료이벤트 리스너
* ServletContextAttributeListner:context에 attribute 추가 수정 삭제 이벤트리스너
* */
@WebListener
public class ContextListenerTest implements ServletContextListener, ServletContextAttributeListener {
    public ContextListenerTest() {
        System.out.println("context listener 인스턴스 생성");
    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("contextInitialized 호출");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("contextDestroyed 호출");
    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("ServletContextAttributeEvent 호출");
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("attributeRemoved 호출");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("attributeReplaced 호출");    }
}
