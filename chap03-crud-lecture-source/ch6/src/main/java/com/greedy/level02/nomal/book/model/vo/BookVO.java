package com.greedy.level02.nomal.book.model.vo;

public class BookVO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    private void constructor(){


    }
    private void constructor(String title,String publisher,String author){
        this.title=title;
        this.publisher=publisher;
        this.author=author;


    }
    private void constructor(String title,String publisher,String author,int price,double discountRate){
        this.title=title;
        this.publisher=publisher;
        this.author=author;
        this.price=price;
        this.discountRate=discountRate;

    }

    void setTitle(String title){

    }
    String getTitle(){

        return null;
    }
    void printInformation(){
        constructor();
    }
}
