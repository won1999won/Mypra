package com.ohgiraffers.chap00autoconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Configuration
public class SpringConfigration {
    @Value("${test.value}")
    public String value;
    @Value("${test.list}")
//    public List<String>list;
    private  String[] list;
    @Value("${test.greeting}")
    private String greeting;
    @Value("${test.array}")
    private Set<String>array;
    @Value("${test.username}")
    private String username;
    @Bean
    public Object propertyReadTest(){
        System.out.println("value:"+value);
        for (String list:list){
            System.out.println("list:"+list);
        }
        System.out.println("greeting:"+greeting);
        Iterator<String> i= array.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("username:"+username);
        return new Object();
    }
}
