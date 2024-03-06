package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application2 {
    public static void main(String[] args) {
        /*와일드 카드
        * 제네릭 클래스타입의 객체를 메소드의 매개변수로 받을때 그 객체의 타입변수를 재한할수있다
        *
        * <?>:제한없음
        * <? extend>와일드카드의 상한제한(타입과 타입의 후손만)

       * <? super>:와일드 카드의 하한제한(타입과 타입의 부모만*/
        wildcardfarm wildcardfarm=new wildcardfarm();

        /*<?>*/
//        wildcardfarm.anytype(new rabbitfarm<mammal>(new mammal()));
//        wildcardfarm.anytype(new rabbitfarm<raptile>(new raptile()));

     wildcardfarm.anytype(new rabbitfarm<rabbit>(new rabbit()));
     wildcardfarm.anytype(new rabbitfarm<bunny>(new bunny()));
     wildcardfarm.anytype(new rabbitfarm<drunkenbunny>(new drunkenbunny()));

     /*<? extned bunny>*/
//        wildcardfarm.expy(new rabbitfarm<rabbit>(new rabbit()));
        wildcardfarm.expy(new rabbitfarm<drunkenbunny>(new drunkenbunny()));
        wildcardfarm.expy(new rabbitfarm<bunny>(new bunny()));

        /*<? super bunny>*/
        wildcardfarm.supertype(new rabbitfarm<rabbit>(new rabbit()));
        wildcardfarm.supertype(new rabbitfarm<bunny>(new bunny()));
//        wildcardfarm.supertype(new rabbitfarm<drunkenbunny>(new drunkenbunny()));
    }
}
