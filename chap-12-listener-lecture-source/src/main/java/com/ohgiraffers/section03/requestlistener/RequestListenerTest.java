package com.ohgiraffers.section03.requestlistener;

import jakarta.servlet.ServletRequestAttributeEvent;
import jakarta.servlet.ServletRequestAttributeListener;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListenerTest implements ServletRequestListener, ServletRequestAttributeListener {
    public RequestListenerTest() {
        System.out.println("RequestListener inst CR");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("attributeAdded");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        System.out.println("attributeRemoved");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("attributeReplaced");
        System.out.println(srae.getName()+":"+srae.getValue());
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
//        리퀘스트 인스턴스 소멸시 (응답완료후 요청해제시)동작
        System.out.println("requestDestroyed");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("requestInitialized");
    }
}
