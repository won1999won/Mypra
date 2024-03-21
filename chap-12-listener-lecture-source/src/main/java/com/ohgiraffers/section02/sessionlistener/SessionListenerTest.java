package com.ohgiraffers.section02.sessionlistener;

import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
@WebListener
public class SessionListenerTest implements HttpSessionListener , HttpSessionAttributeListener {
    public SessionListenerTest() {
        System.out.println("SessionListenerTest 생성");
    }
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("sessionCreated");
        System.out.println("session Id"+se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("sessionDestroyed");
    }
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("attributeAdded");
        System.out.println("add att"+event.getName()+","+event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("attributeRemoved");
        System.out.println("remove att"+event.getName()+","+event.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("attributeReplaced");
        System.out.println("replaced att"+event.getName()+","+event.getValue());

    }


}
