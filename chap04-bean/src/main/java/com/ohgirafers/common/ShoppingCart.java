package com.ohgirafers.common;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private  final List<Product> items;

//    기본적으로 생성자가 호출될때 arraylist가 만들어질수있도록한다
    public ShoppingCart() {
        items =new ArrayList<>();
    }
    public  void additem(Product item){
        items.add(item);

    }
    public  List<Product>getItems(){
        return items;
    }
}
