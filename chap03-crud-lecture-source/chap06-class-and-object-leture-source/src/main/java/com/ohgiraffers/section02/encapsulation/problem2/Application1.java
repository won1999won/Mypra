package com.ohgiraffers.section02.encapsulation.problem2;

public class Application1 {
    public static void main(String[] args) {

        monster2 monster1=new monster2();
        monster2 monster2=new monster2();
        monster1.name="칼갈이";
        monster1.hp=10;
        monster2.name="락교주";
        monster2.hp=999;

        System.out.println("monster1 name:"+monster1.name);
        System.out.println("monster1 hp:"+monster1.hp);

        System.out.println("monster2 name:"+monster2.name);
        System.out.println("monster2 hp:"+monster2.hp);



    }
}
