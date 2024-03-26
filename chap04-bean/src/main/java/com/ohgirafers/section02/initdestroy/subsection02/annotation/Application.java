package com.ohgirafers.section02.initdestroy.subsection02.annotation;

import com.ohgirafers.common.Beverage;
import com.ohgirafers.common.Bread;
import com.ohgirafers.common.Product;
import com.ohgirafers.common.ShoppingCart;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ContextConfiguration.class);
        Product carpBread=context.getBean("carpBread", Bread.class);
        Product milk=context.getBean("milk", Beverage.class);
        Product water=context.getBean("water", Beverage.class);

        ShoppingCart cart1 =context.getBean("cart",ShoppingCart.class);
        cart1.additem(carpBread);
        cart1.additem(water);
        System.out.println(cart1.getItems());
        ShoppingCart cart2=context.getBean("cart", ShoppingCart.class);
        cart2.additem(milk);
        System.out.println(cart2.getItems());
        ((AnnotationConfigApplicationContext)context).close();
    }
}
