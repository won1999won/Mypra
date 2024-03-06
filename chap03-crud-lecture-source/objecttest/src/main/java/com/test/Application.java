package com.test;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /*사람생성 (이름,나이는 생성시초기화)*/
        /*사람의 국적 설정 1한국 2일본 3중국 4홍콩 5터키/이외의 입력시 한국으로 설정*/
        /*강아지 입양>사람이 할수있는일=person메소드를 호출해서 dog추가
        * 단 강아지는 반드시 이름이 있어야함 강아지 입력 스캐너로*/
        /*강아지에게 재주 가르치기>사람이 할수있는일=person의 매개변수가 있는 메소드를 호출해서 dog의 어빌리티 추가
        * 아직 못배운 재주면 실행불가문 출력*/
        String[] teachningability=new String[]{"앉아","서","돌아"};
        person person=new person("김정원",12);
        the_dog the_dog=new the_dog();


        System.out.println("국적입력");
        person.setNation();
        person.adoptDog();
        person.teachDog(teachningability);
        person.infom();
        person.mydog();
        System.out.println("명령입력");
        person.ordertodog();



    }

}
