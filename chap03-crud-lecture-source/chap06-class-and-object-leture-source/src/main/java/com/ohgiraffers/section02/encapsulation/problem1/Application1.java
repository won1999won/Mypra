package com.ohgiraffers.section02.encapsulation.problem1;

public class Application1 {
    public static void main(String[] args) {
        monster monster1=new monster();
        monster monster2=new monster();

        monster1.name="아슬한";
        monster1.hp=200;
        monster2.name="킬러 토마토";
        monster2.hp=290;


        System.out.println("monster1 name:"+monster1.name);
        System.out.println("monster1 hp:"+monster1.hp);

        System.out.println("monster2 name:"+monster2.name);
        System.out.println("monster2 hp:"+monster2.hp);

        monster monster3=new monster();
        monster3.name="신붕이";
        monster3.sethp(-299);
        System.out.println("m3 hp:"+monster3.hp);
        System.out.println("m3 name:"+monster3.name);



    }
}
