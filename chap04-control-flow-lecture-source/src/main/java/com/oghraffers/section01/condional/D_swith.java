package com.oghraffers.section01.condional;

import java.util.Scanner;

public class D_swith {

    public void cimpleswitchstatemment(){

        /*
        * 스위치문 표현식
        * 스위치(비교할변수){
        *     case 비교값1: 비교변수값1==비교값1인 경우 실행할 구문;brake;
        *     case 비교값2: 비교변수값2==비교값2인 경우 실행할 구문;brake;
        *     default: 위 case에 모두 당하지않을경우 실행할 구문;brake;
        * }
        * */

        Scanner sc=new Scanner(System.in);
        System.out.println("첫정수입력:");
        int fName= sc.nextInt();
        System.out.println("두번째 정수입력");
        int sName= sc.nextInt();
        System.out.println("연산기호 입력(+._.*./.%)");
        char op=sc.next().charAt(0);

        /*연산결과를 저장할 변수*/
        int result= 0;

        switch (op){
            case '+':result=fName+sName;break;
            case '-':result=fName+sName;break;
            case '*':result=fName*sName;break;
            case '/':result=fName/sName;break;
            case '%':result=fName%sName;break;
            default:
                System.out.println("error");
        }
        System.out.println(fName+" "+op+" "+sName+" "+result);

    }
    public void switchvendingmachine(){
        /*스위치-케이스문 이용실습
        * 1.스캐너를 이용해 음료 이름(스트링)과 갯수(인트)입력
        * 2.스위치 케이스문을 사용해 전체 가격을 구한다
        * 3.[음료이름 을 개수 개 선택하셧습니다 가격 을 투입하여 주십시오]출력되게한다
        *
        * */
        System.out.println("====자판기====");
        /*콜라 1700/환타4500/사이다2300/커피8900*/
        System.out.println("코카콜라 환타 사이다 커피");
        System.out.println("==============");


        Scanner sc=new Scanner(System.in);
        System.out.println("name");
        String name= sc.nextLine();
        System.out.println("number");
        int number=sc.nextInt();

        int result= 0;


        switch (name){
            case "코카콜라":result=1700*number;break;
            case "환타":result=4500*number;break;
            case "사이다":result=2300*number;break;
            case "커피":result=8900*number;break;
            default:
                System.out.println("error");

        }
        System.out.println(name+"를"+number+"개 선택하셧습니다"+result+"을 넣어주세요");









    }
}
