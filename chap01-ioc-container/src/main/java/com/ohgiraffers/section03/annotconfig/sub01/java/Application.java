package com.ohgiraffers.section03.annotconfig.sub01.java;

import com.ohgiraffers.common.MemberDAO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(ContextConfigretion.class);


        String[] beanNames= context.getBeanDefinitionNames();
        for (String beanName:beanNames){
            System.out.println(beanName);
        }
        MemberDAO memberDAO=context.getBean("memberDAO", MemberDAO.class);
        System.out.println(memberDAO.selctmember(1));
        System.out.println(memberDAO.insertmember(new MemberDTO(3,"user03","pass03","dog")));

    }
}
