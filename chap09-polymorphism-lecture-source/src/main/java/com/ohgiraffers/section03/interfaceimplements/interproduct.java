package com.ohgiraffers.section03.interfaceimplements;

    public interface interproduct{



    /*인터페이스는 상수필드만 작성이 가능하다
    *public void final 제어자의 조합을 상수필드라 한다
    * 반드시 선언과 동시에 초기화 해줘야한다*/



    public static final int max_mun=100;

    int min_num=10;
    /*인터 페이스는 생성자를 가질수없음*/
//        public interproduct(){}
        /*구현부가 있는 비 스태틱 메소드를 가질수없음*/
//        public void nons(){}

        /*추상 메소드만 가능*/
        public abstract void nons();
        /*인터페이스의ㅣ 메소드는 묵시적으로 public avstract를 가지기때문에
        * 인터페이스를 오버라이딩 할경우
        * 반드시 접근제한자를 퍼블릭으로 해야한다*/

        void abstm();

        /*다만 스태틱 메소드는 작성가능(jdk1.8부터)*/
        public static void staticmethod(){
            System.out.println("인터페이스 클래스의 스태틱메소드 호출");
        }
        /*또한 default 키워드를 사용하면 비 스태틱 메소드도 작성가능*/
        public default void defoltmethod(){
            System.out.println("인터페이스 클래스의 디폴트 메소드 호출");
        }
}
