package com.ohgirafers.section02.initdestroy.subsection02.annotation;

import com.ohgirafers.common.Beverage;
import com.ohgirafers.common.Bread;
import com.ohgirafers.common.Product;
import com.ohgirafers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {
    @Bean
    public Product carpBread(){
        return  new Bread("a",1000,new java.util.Date());
    }
    @Bean
    public  Product milk(){
        return  new Beverage("2",1500,500);
    }
    @Bean
    public Product water(){
        return new Beverage("3",3000,300);
    }
    @Bean
    @Scope("prototype")
    public  ShoppingCart cart(){
        return  new ShoppingCart();
    }
//    XMl파일에서 <bean>태그를 이용할경우 <bean id="cart" class="com.ohgiraffers.section01.xmlconfig.ShoppingCart" scope="prototype"/>
}
