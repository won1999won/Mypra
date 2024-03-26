package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ContextConfiguration.class);
        MemberDTO memberDTO=context.getBean(MemberDTO.class);
        System.out.println(memberDTO.getPersonalAccount());
        System.out.println(memberDTO.getPersonalAccount().deposit(100000));
        System.out.println(memberDTO.getPersonalAccount().getBlace());
        System.out.println(memberDTO.getPersonalAccount().withDrow(2000));
        System.out.println(memberDTO.getPersonalAccount().getBlace());

    }
}
