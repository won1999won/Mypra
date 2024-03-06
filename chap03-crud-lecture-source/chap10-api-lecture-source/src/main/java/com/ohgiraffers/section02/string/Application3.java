package com.ohgiraffers.section02.string;

import java.util.StringTokenizer;

public class Application3 {
    public static void main(String[] args) {


    /*문자열 분리
    * split():정규표현식을 이용하여 문자열을 분리한다
    * 비 정형화된 문자열을 분리할때 좋지만
    * 정규표현식을 이용하기때문에 속도가 느리다
    *
    * Stringtokenizer:문자열의 모든 문자들을 구분자로 하여 문자열을 분리한다
    * 정형화된 무자열 패턴을 분리할때 사용하기 좋다(공백무시)
    * split()보다 빠르다
    * 구분자를 생략하는 경우 공백이 기본 구분자이다*/
    String emp1="100/aa/su/oo";//모든값있음
    String emp2="200/dd//gg";//3번없음
    String emp3="300/qq/rr/";//4번없음

    String[] emparr1=emp1.split("/");
    String[] emparr2=emp2.split("/");
    String[] emparr3=emp3.split("/");

    for(int i=0;i<emparr1.length;i++){
        System.out.println("amparr1["+i+"]"+emparr1);

    }
    /*stringtokenizer의 경우 공백으로 존재하는 값을 무시해 버린다*/
//        StringTokenizer st1=new StringTokenizer(emp1,"/");
//        StringTokenizer st2=new StringTokenizer(emp2,"/");
//        StringTokenizer st3=new StringTokenizer(emp3,"/");

        /* 반면 StringTokenizer의 경우 공백으로 존재하는 값을 무시해버린다. */
        StringTokenizer st1 = new StringTokenizer(emp1, "/");
        StringTokenizer st2 = new StringTokenizer(emp2, "/");
        StringTokenizer st3 = new StringTokenizer(emp3, "/");
        while(st1.hasMoreTokens()) {
            System.out.println("st1 : " + st1.nextToken());
        }
        while(st2.hasMoreTokens()) {
            System.out.println("st2 : " + st2.nextToken());
        }
        while(st3.hasMoreTokens()) {
            System.out.println("st3 : " + st3.nextToken());
        }
        /* nextToken()으로 토큰을 꺼내면 해당 StringTokenizer의 토큰을 재사용 하는 것이 불가능하다. */
        while(st1.hasMoreTokens()) {
            System.out.println("st1 : " + st1.nextToken());
        }
        /* split()은 정규표현식 이용(문자열 패턴), StringTokenizer는 구분자 문자열 이용 */
        String colorStr = "red*oranage#blue/yellow green";
        /* "*#/ " 이라는 문자열이 구분자로 존재하지 않아서 에러 발생함 */
// String[] colors = colorStr.split("*#/ "); //에러남
        /* 대괄호로 묶은 문자열은 문자열이 아닌 각 문자들의 패턴으로 볼 수 있다.
         * 따라서 순서 상관 없이 존재하는 문자들을 이용해서 구분자로 사용할 수 있다.
         * */
        String[] colors = colorStr.split("[*/# ]"); //순서 상관 없음
        for(int i = 0; i < colors.length; i++) {
            System.out.println("colors[" + i + "] : " + colors[i]);
        }
        /* StringTokenizer의 두 번째 인자 문자열 자체는 연속된 문자열이 아닌 하나하나를 구분자로 이용하겠다는 의미이다. */
        StringTokenizer colorStringTokenizer = new StringTokenizer(colorStr, "*#/ ");
        while(colorStringTokenizer.hasMoreTokens()) {
            System.out.println(colorStringTokenizer.nextToken());
        }

    }
}