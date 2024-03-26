package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Application {
//    생성자에 @Configuration 어노테이션이 달린 설정 클래스의 메타 정보를 전달 한다
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ContextConfigration.class);
        MemberDTO memberDTO=context.getBean("memder", MemberDTO.class);
        System.out.println(memberDTO);
    }
}
