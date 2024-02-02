package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application4 {
    public static void main(String[] args) {

        /*
        * 카드뽑기
        * 1.문자열 배열에 스페이드,클로버,하트,다이아몬드를 저장
        * 2.문자열 배열에 2,3,4,5,6,7,8,9,10,잭,퀸,킹,에이스를 저장
        * 3.1번과 2번 배열의 길이에 맞도록 난수를 각각 발생시킨다
        * 4. 위에서 발생시킨 난수를 활용하여 카드를 출력한다
        *
        * ====예시====
        * 카드는 다이아 9다
        * */

        String[] tp={"스페이드","클로버","하트","다이아몬드"};
        String[] nub={"2","3","4","5","6","7","8","9","10","잭","퀸","킹","에이스"};
        int rec=(int) (Math.random()*tp.length);
        int rec2=(int) (Math.random()*nub.length);
        String a=tp[rec];
        String b=nub[rec2];


        System.out.println("카드는"+(a+b)+"이다");

    }
}
