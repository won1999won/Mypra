package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
    ApplicationContext context=new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");
//    빈의 아이디를 이용해서 빈을 가져오기
//   MemberDTO memberDTO= (MemberDTO) context.getBean("member");
//    빈의 클래스 메타정보를 전달하여 가져오기
//   MemberDTO memberDTO=context.getBean(MemberDTO.class);
//    빈의 아이디와 클래스 메타정보 전부로 가져오는 방법
   MemberDTO memberDTO=context.getBean("member", MemberDTO.class);

        System.out.println(memberDTO);
    }

}
