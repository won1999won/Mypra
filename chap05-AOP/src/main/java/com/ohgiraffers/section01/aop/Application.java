package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.ohgiraffers.section01.aop");
        MemberService memberService=context.getBean("memberService", MemberService.class);
        System.out.println("=======s ms===");
        System.out.println(memberService.selectmembers());
        System.out.println("========s m=======");
        System.out.println(memberService.selectMember(2L));

    }
}
