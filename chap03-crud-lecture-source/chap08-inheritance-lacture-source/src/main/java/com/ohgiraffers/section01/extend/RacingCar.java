package com.ohgiraffers.section01.extend;

public class RacingCar extends car{

    public RacingCar(){
        System.out.println("레이싱카 클래스 기본 생성자 호출");
    }
    @Override
    public void run(){
        System.out.println("전력전개질주우우우우");
    }
    public void soundhorn(){
        System.out.println("이거 경적 없는데요 경적은 장십입니다");
    }
    public void stop(){
        System.out.println("긴급 정지");
    }

}
