package com.ohgiraffers.section02.solution;

public class Application1 {
    public static void main(String[] args) {

        monster3 monster1= new monster3();
        monster1.setinfo("무웅");
        monster1.sethp(100);

        monster3 monster2= new monster3();
        monster2.setinfo("아크엔젤");
        monster2.sethp(1100);

        monster3 monster3= new monster3();
        monster3.setinfo("미네르바");
        monster3.sethp(11002);

        monster3 monster4= new monster3();
        monster4.setinfo("이터널");
        monster4.sethp(11100);

        System.out.println(monster1.getinfo());
        System.out.println(monster2.getinfo());
        System.out.println(monster3.getinfo());
        System.out.println(monster4.getinfo());


    }
}
