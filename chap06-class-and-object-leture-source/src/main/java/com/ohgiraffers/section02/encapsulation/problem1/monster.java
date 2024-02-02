package com.ohgiraffers.section02.encapsulation.problem1;

public class monster {
//    String name;
//    int hp;

    String name; //전역번수==필드==속성==인스턴스변수
   int hp;

    public void sethp(int hp/*매개변수==지역변수*/){
        if (hp>0){
            /*this는 인스턴스가 생성되었을때 자신의 주소를 저장하는 레퍼런스 변수이다
            * 지역변수와 전역변수의 이름이 동일한경우 지역변수를 우선적으로 접근하기 때문에
            * 전역변수에 접근하기위해선 this.을 명시해야한다*/
            this.hp=hp;
        }else{
            System.out.println("음수일경우 0으로");
            this.hp=0;
        }

    }

}
