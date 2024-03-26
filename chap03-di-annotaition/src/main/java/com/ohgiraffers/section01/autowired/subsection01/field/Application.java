package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.ohgiraffers.section01");
        BookService bookservice=context.getBean("bookServiceField", BookService.class);
//        전체 도서 목록 조회후 출력
        bookservice.selectAllBooks().forEach(System.out::println);
//        도서번호로 출력
        System.out.println(bookservice.searchBookBySequence(1));
        System.out.println(bookservice.searchBookBySequence(2));
    }
}
