package com.ohgirafers.section02.initdestroy.subsection02.annotation;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Owner {
//    init-method와 같은 설정 어노테이션
    @PostConstruct
    public  void  openShop(){
        System.out.println("open");
    }
//    destrory method와 같은 어노테이션
    @PreDestroy
    public void  closeShop(){
        System.out.println("close");
    }
}
