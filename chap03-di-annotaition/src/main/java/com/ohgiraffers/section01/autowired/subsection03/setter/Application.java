package com.ohgiraffers.section01.autowired.subsection03.setter;

import com.ohgiraffers.section01.autowired.subsection01.field.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext("com.ohgiraffers.section01");
        BookService bookservice=context.getBean("bookServiceSetter", BookService.class);
        bookservice.selectAllBooks().forEach(System.out::println);
        System.out.println(bookservice.searchBookBySequence(2));
    }
}
