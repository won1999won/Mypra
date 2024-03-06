package com.oghraffers.section01.condional;

import java.util.Scanner;

public class C_ifelse {

    public void simpleifelseifstatment(){

        /*
        * [if-elseif문 표현식]
        * if(조건식1){
        *    조건식1이 트루일때 명령문
        *
        * }else{
        * 조건식1이 거짓이고 조건식2가 참일때 명령문
        *
        * }else{
        *    1,2가 거짓일경우 명령문;
        * }
        *
        * */
        System.out.println("하늘에서 퍼건이 나타났다");
        System.out.println("어느 건담이 네 건담이냐(1.유니콘/2.엑시아/3.운드워트)");

        Scanner sc=new Scanner(System.in);
        int answer= sc.nextInt();

        if (answer==1){
        System.out.println("사야같은 놈! 엑시즈를 받아라!!!");

    } else if(answer==2){
            System.out.println("크와트로 같은 놈! 솔라레이를 받아라!");
        }else{
            System.out.println("정직한 건덕이구나,너에게는 메탈빌드 운드워트를 주마!");
        }
        System.out.println("아무로는 그렇게 말하고 하늘로 사라진다...이것또한 인류의 기적인가");


    }

    public void nestedifelseifstatement(){

        Scanner sc=new Scanner(System.in);
        System.out.println("name");
        String name=sc.nextLine();
        System.out.println("point");
        int point= sc.nextInt();
        /*학생의 등급을 저장하기위한 변수*/
        String grade="";

        if (point>=90){
            grade="A";

            if(point>=95){
                grade+="+";// +=를 넣음으로 A+가 출력된다

            }else if(point>=80){
                grade="B";

            }else if (point>=70){
                grade="C";

            }else if (point>=60){
                grade="D";
            }else if (point>=50){
                grade="E";
            }else{
                grade="F";
            }

        }
        System.out.println(name+"학생의 점수는"+grade+"이다");

    }


}
