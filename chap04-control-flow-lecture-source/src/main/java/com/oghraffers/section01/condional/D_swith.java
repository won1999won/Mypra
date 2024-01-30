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
            case '+':result=fName+sName;
            case '-':result=fName+sName;
            case '*':result=fName*sName;
            case '/':result=fName/sName;
            case '%':result=fName%sName;
            default:
                System.out.println("error");
        }

    }
}
