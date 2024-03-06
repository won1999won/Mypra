package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {

        /*추상화란
        * 공통된 부분을 추출하고 그렇지않은 부분을 제거한다는의미,추상화의 목적은 유연성을 확보하기 위함이다
        * 유연성 확보는 여러곳에 정용될수있는 유연한 객체를 의미하며 재사용성이 높아질수있게한다
        *  객체의 재사용성이 증가하면 중복 작성되는 코드를 줄일수있으며 오류 발생 가능성을 감소시키고 유지보수성을 증가시킨다
        * */



        /*
        * 시스템 요구사항
        * 1.운전자는 시동걸기,엑셀 밟기,브레이크 밟기 시동끄기를 할수있다
        * 2.자동차는 시동걸기 앞으로가기 멈추기 시동끄기를 할수있다
        * 3.자동자는 처음에 멈춤상태로 대기하고있다(시동꺼짐)
        * 4.운전자는 먼저 자동차에 시동을 건다 이미 걸려있을경우 다시 시동을 걸수없다
        * 5.운전자가 엑셀을 밟으면 시동이 걸린 상태일 경우 자동차는 시속 10km/h로 증가하며  앞으로 나간다
        * 6.자동차가 달리는 종안 브레이크를 밟으면 자동차의 시속은 0으로 떨어진다
        * 7.브레이크를 밟을때 자동차가 달리는중이 아니라면 이미 멈춤상태라 안내한다
        * 8.운전자가 시동을끄면 더이상 자동차는 움직이지 않는다
        * 9.자동차가 달리는 중이라면 시동을 끌수없다
        * */

        /*
        * 프로그램 설계
        * 1.필요한 객체를 도출
        *  -플레이어,운전자,자동차
        * 2.객체간의 상호작용
        *  -운전자가 수신할수있는 메세지(운전자가 하는일)
        *    1)시동을 걸어라
        *    2)엑셀을 밟아라
        *    3)브레이크를 밟아라
        *    4)시동을꺼라
        *   -자동차가 수신할수있는 메세지(자동차가 하는일)
        *    1)시동걸기
        *    2)앞으로 가라
        *    3)멈춰라
        *    4)시동을꺼라
        *
        *
        * 3.커뮤니케이션 다이어그램(동적)
        * 4.클래스 설계(정적)
        *  1)carDraiver 클래스
        *       -속성:자동차(car 클래스)
        *       -행위(기능):시동걸기,엑셀밟기,브레이크밟기,시동을 끄기
        *  2)car클래스 클래스
        *        -속성:속도,시동상태
        *        -행위(메소드):시동걸기,앞으로가기,멈추기,시동을끄기
        * */


        cardriver driver=new cardriver();

        Scanner sc=new Scanner(System.in);


        while (true){
            System.out.println("=========카레이싱 프로그렘=========");
            System.out.println("1.시동걸기");
            System.out.println("2.전진");
            System.out.println("3.가속");
            System.out.println("4.정지");
            System.out.println("5.시동끄기");
            System.out.println("6.드리프트");
            System.out.println("7.점프");
            System.out.println("9.프로그램 종료");
            int no=sc.nextInt();

            switch (no){
                case 1:driver.startup();break;
                case 2:driver.stepaccelator();break;
                case 3:driver.fast();break;
                case 4:driver.stepbraek();break;
                case 5:driver.turnoff();break;
                case 6:driver.drift();break;
                case 7:driver.jump();break;
                case 9:
                    System.out.println("프로그램 종료");break;
                default:
                    System.out.println("미지정 숫자 입렵");break;

            }
            if (no==9){
                break;
            }



        }
    }
}
