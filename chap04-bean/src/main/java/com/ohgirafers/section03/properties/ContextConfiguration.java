package com.ohgirafers.section03.properties;

import com.ohgirafers.common.Beverage;
import com.ohgirafers.common.Bread;
import com.ohgirafers.common.Product;
import com.ohgirafers.common.ShoppingCart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.Date;

@Configuration
@PropertySource("section03/properties/product-info.properties")
public class ContextConfiguration {
//    치환자 문법으로 프로퍼티즈에 저장된 키를 입력하면 밸류에 해당하는 값을 추출
//    :를 사용하면 값을 읽지 못하는 경우 대체값을 지정가능
//    공백은 인식하지못한다
    @Value("${bread.carpbread.name:네모빵}")
    private String carpBreadName;
    @Value("${bread.carpbread.price}")
    private int carpBreadPrice;
    @Value("${beverage.milk.name}")
    private String milkName;
    @Value("${beverage.milk.price}")
    private int milkPrice;
    @Value("${beverage.milk.capacity}")
    private int milkCapacity;

    @Bean
    public Product carpBread(){
        return new Bread(carpBreadName,carpBreadPrice,new Date());
    }
    @Bean
    public Product milk(){
        return new Beverage(milkName,milkPrice,milkCapacity);
    }
    @Bean
    public  Product water(@Value("${beverage.water.name}")String waterName, @Value("${beverage.water.price}")int waterPrice, @Value("${beverage.water.capacity}")int waterCapacity){
        return new Beverage(waterName,waterPrice,waterCapacity);
    }
    @Bean
    @Scope("prototype")
    public ShoppingCart cart(){
        return  new ShoppingCart();
    }
}
