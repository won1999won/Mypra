package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {


        /*static
         * 정적 메모리 영역에 프로그램이 스타트될때 할당을하는 키워드
         * 인스턴스를 생성하지않고 사용할 클래스의 멤버(필드,메소드)에 지정할수있다
         * 여러 인스턴스가 공유해서 사용할 목적의 공간
         * 하지만 static 키워드의 남발은 유지보수와 추적이 힘든 코드를 작성하는 피해야할방식
         * 명확한 목적이 존재하지않는한 스태틱 키워드는 자제해야한다
         * 의도적으로 스태틱키워드를 사용하는 배표적인예는 singteton객체를 생성할때이다*/

        staticfieldtest sft1 = new staticfieldtest();


        System.out.println(sft1.getNonstatic());
        System.out.println(sft1.getStaticcount());

        /*필드의 값 1식 증가*/

        sft1.increasenonstaticcount();
        sft1.increasestaticcont();

        System.out.println(sft1.getNonstatic()); //1
        System.out.println(sft1.getStaticcount()); //1


        staticfieldtest sft2=new staticfieldtest();
        System.out.println(sft2.getNonstatic()); //0
        System.out.println(sft2.getStaticcount()); //1


    }
}
