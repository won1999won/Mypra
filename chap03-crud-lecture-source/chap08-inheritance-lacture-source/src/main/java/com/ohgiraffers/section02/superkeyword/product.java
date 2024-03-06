package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class product {
    private String code; //상품코드
    private String brand; //제조사
    private String name;  //이름

    private int price; //가격
    private Date manufaturingdata; //제조일

    public product(){
        System.out.println("프로덕트 클래스의 기본생성자 호출");
    }
//    public product(String code,String brand,String name,int price,Date manufaturingdata){
//        this.code=code;
//        this.brand=brand;
//        this.name=name;
//        this.price=price;
//        this.manufaturingdata=manufaturingdata;

    public product(String code, String brand, String name, int price, Date manufaturingdata) {
        this.code = code;
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.manufaturingdata = manufaturingdata;

        System.out.println("프로덕트 클래스의 매개변수있는 생성자 호출");
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setManufaturingdata(Date manufaturingdata) {
        this.manufaturingdata = manufaturingdata;
    }

    public String getCode() {
        return code;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Date getManufaturingdata() {
        return manufaturingdata;
    }
    public String getinfo(){
        return "product [code="+code+", brand="+brand+", name="+name+", prise="+price+",data="+manufaturingdata+"]";
    }
}


