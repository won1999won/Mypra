package com.ohgiraffers.section06.finalkeyword;

public class finalfieldtest {
    /*
    * final
    * final은 종단의 키워드
    * final 키워드를 사용할수있는 위치는 다연한편이며 의미가 약간 다르지만 결국 변경 불가의 의미다
    * 1.지역변수:초기화이후 변경불가
    * 2.매개변수:호출시 전달한 인자변경불가
    * 3.전역변수:인스턴스 생성후 초기화 이후 값 변경불가
    * 4.클래스(Static) 변수:프로크림 시작후 값 변경불가
    * 5.비 스태틱 메소드:메소드 재작성(overriding) 불가
    * 6.Static 메소드:메소드 재작성 불가
    * 7.클래스:상속불가*/

//    private final int nonstaticnum; //0으로 초기화되어 이후 변경불가능

    /*스태틱이 아닌 필드에 final사용*/
//    private final int noo_static_num=1;
//    private final String non_static_name;
//    public finalfildtest(String nonstaticname){
//        this.non_static_name=nonstaticname;
//        System.out.println(finalfieldtest);
//    }
//    /*스태틱 필드에 파이널 사용*/
////    private final int static_num; //0으로 초기화 되어 이후 변경 불가능 하기때문이다
//
//private static final int static_num=1;
///*생성자를 이용한 초기화는 불가능
//* 생성자는 인스턴스가 생성되는 시점에 호출되기에 그전에 초기화가 일어나지않는다
//* 하지만 스태틱은 프로그램이 스타트 될때 할당되기때문에 초기화 되지않은 상태로 선언 된것과 동일하며
//* 기본값으로 초기화 된후 값을 변경하지못하기에 에러가 발생한다*/
//
//private static final double static_duble;
//
////public finalfieldtest(double static_duble){
////    finalfieldtest.static_duble=static_duble;
////}
//
//
//
//    /*초기화 블럭으로 초기화*/
//    static {
//        static_duble=0.5;
//    }
//
//    public finalfieldtest(String nonStaticName) {
//        non_static_name = nonStaticName;
//
//        System.out.println(finalfieldtest);
//    }

}

