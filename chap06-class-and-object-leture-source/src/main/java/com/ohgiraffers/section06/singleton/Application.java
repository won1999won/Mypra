package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {


        /*singleton pattern 이란
         * 애플리 케이션이 사작될때 어떤 클래스가 최초 한번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어서
         * 하나의 인스턴스를 공유해 사용하며 메모리 낭비를 방지할수있게함(매번 인스턴스를 만들지않음)
         *
         *
         * 장점
         * 1.첫번째 이용시에는 인스턴스를 생성해야하므로 속도 차이가 나지 않지만
         * 두번째 이용사에는 인스턴스 생성 시간없이 사용할수있다
         * 2.인스턴스가 절대적으로 한개만 존재하는것을 보증할수없다
         *
         * 단점
         * 1.싱글톤 인스턴스가 너무 많은일을 하거나 많은 데이더를 공유하면 결합도가 높아진다
         * (유지보수와 테스트에 문제)
         * 2.동시성 문제를 고려해서 설계하기 때문에 난이도가있다
         *
         *
         * 싱글톤 구현방법
         * 1.이른 초기화
         * 2.게으른 초기화*/


        /*이른 초기화 구현*/
        /*생성자를 이용해 인스턴스 새ㅇ성을 하지 못하고 getinstance()메소드를 호출해야지만 인스턴스를 생성할수있다*/
//    eagersingleton eager=new eagersingleton();

        eagersingleton eager1 = eagersingleton.getInstance();
        eagersingleton eager2 = eagersingleton.getInstance();

        System.out.println("e1의 해쉬:"+eager1.hashCode());
        System.out.println("e2의 해쉬:"+eager2.hashCode());


        /*게으른 초기화 구현*/
        lazysingleton lazy1=lazysingleton.getInstance();
        lazysingleton lazy2=lazysingleton.getInstance();

        System.out.println("l1의 헤쉬:"+lazy1.hashCode());
        System.out.println("l2의 헤쉬:"+lazy2.hashCode());
    }
}
