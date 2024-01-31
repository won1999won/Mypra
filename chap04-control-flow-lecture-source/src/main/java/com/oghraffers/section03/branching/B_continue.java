package com.oghraffers.section03.branching;

public class B_continue {

    public void simplecontinuestatement(){


        /*
        * continue문은 반복문 내에서 사용한다
        * 해당 반복문의 반복회차를 멈추고 다시 증감식으로 넘어가게 해준다
        * 일반적으로 if(조건식){continue}처럼 사용된다
        * 보통 특정 조건에 대한 예외를 처리하고자할때 사용된다
        * */
        for (int i=1;i<=100;i++){
            if (i%4==0&&i%5==0) {
                System.out.println(i);
            }else{
                continue;

            }
        }
    }
    public  void simplecontinuestatement2(){
        /*구구단출력
        * 단, 단이 짝수일경우에만 출력 생략*/
        for (int dan=2;dan<10;dan++){
            for (int su2=1;su2<10;su2++){
                if (su2%2==0){
                    continue;
                }
                System.out.println(dan+"*"+su2+"="+(dan*su2));

            }
        }
    }
}
