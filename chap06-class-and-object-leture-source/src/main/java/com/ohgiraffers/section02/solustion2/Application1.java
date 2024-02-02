package com.ohgiraffers.section02.solustion2;

public class Application1 {
    public static void main(String[] args) {

        monster4 monster1=new monster4();
//        monster1.kinds="ddd";
//        monster1.hp=0;
        monster1.setkinds("ddd");
        monster1.sethp(200);

        System.out.println(monster1.getinfo());

    }

}
