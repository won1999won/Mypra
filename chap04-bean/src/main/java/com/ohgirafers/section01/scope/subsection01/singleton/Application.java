package com.ohgirafers.section01.scope.subsection01.singleton;

import com.ohgirafers.common.Beverage;
import com.ohgirafers.common.Bread;
import com.ohgirafers.common.Product;
import com.ohgirafers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ContextConfiguration.class);
        String[] beanName= context.getBeanDefinitionNames();
        for (String name:beanName){
            System.out.println("beanName:"+name);
        }
        Product carpBread=context.getBean("carpBread", Bread.class);
        Product milk=context.getBean("milk", Beverage.class);
        Product water=context.getBean("water", Beverage.class);
        ShoppingCart cart1=context.getBean("cart", ShoppingCart.class);
        cart1.additem(carpBread);
        cart1.additem(milk);
        System.out.println(cart1.getItems());
        ShoppingCart cart2=context.getBean("cart", ShoppingCart.class);
        cart2.additem(water);
        System.out.println(cart2.getItems());
        System.out.println(cart1.hashCode()+" "+cart2.hashCode());
//        Spring Framework 에서 bean 스코프는 Singleton이다 싱글톤 스코프를 갖는 빈은 어플리케이션에서 유일한 인스턴스를 갖는다 컨테이너는 cart라는 빈을 하나만 자기고있기에 둘모두 같은 주소값을 가진다



    }
}
