package com.ohgiraffers.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {
            Application4 app4=new Application4();
            animal randomanimal= app4.getrom();
            randomanimal.cry();

    }
    public animal getrom(){
        int ramdum=(int)(Math.random()*2);
        return ramdum==0? new cat():new tiger();
    }
}
