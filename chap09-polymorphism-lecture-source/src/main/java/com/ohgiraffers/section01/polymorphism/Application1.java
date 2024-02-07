package com.ohgiraffers.section01.polymorphism;

public class Application1 {
    public static void main(String[] args) {


        /*다형성
        * 다형성은 아나의 인스턴스가 여러타입을 가지는것을 의미한다
        * 그러므로 하나의 타입으로 여러 타입의 인스턴스를 처리할수있고
        * 하나의 메소드를 호줄하여 객체별로 각기 다른 방법으로 동작하게할수있다
        *
        * 장점
        * 1.여러 타입의 객체를 하나의 타입으로 관리할수있기때문에 유지보수성과 생산성이 높다
        * 2.상속을 기반으로한 기술이기에 상속 관계에있는 모든 객체는 동일한 메세지를수신할수있다
        *              이런 동일한 메시지를 수신받아 처리하는 내용도 객체별로 다르게 할수있다
        * 3.확장성이 좋은 코드를 작성할수있다
        * 4.결합도를 낮춰 유지보수성을 높인다
        * */
        System.out.println("애니멀 생성==");
        animal animal1=new animal();
        animal1.eat();
        animal1.cry();
        animal1.run();

        System.out.println("============캣 생성");

        cat cat=new cat();
        cat.cry();
        cat.jump();
        cat.eat();
        cat.run();


        System.out.println("=========호랑이생성");
        tiger tiger=new tiger();
        tiger.bite();
        tiger.cry();
        tiger.run();
        tiger.eat();
        /*cat과tiger는 애니멀 클래스를 상속받았다
        * 따라서 캣은 캣타입이면서 애니멀 타입이며
        * 타이거는 타이거타입이면서 애니멀 타입이다*/

        /*다형성->부모 타입으로 자식 인스턴스값 저장*/
        animal a1=new cat();
        animal a2=new tiger();

        /*반대로 자식 타입으로 부모인스턴스 주소값을 저장하려고 하면 에러*/
//        cat c=new animal();
//        tiger t=new animal();

        /*동적바이딩
        * 컴파일 당시에는 (선언한)해당 타입의 메소드와 연결되어있다가
        * 런타임 당시 실제 객체가 가진 오버라이딩된 메소드로 바인딩이 바뀌어 동작한다
        * */

        System.out.println("동적바인딩 확인=====");
        a1.cry();
        a2.cry();


        /*현제 래퍼런스의 타입은 애니멀이기에 캣과 타이거의 기능은 사용불가*/
//        a1.jump();
//        a2.bite();


        /*타입 형변환
        * class type casting:클래스 형변환
        * 타입 형변환시 실제 인스턴스와 타입이 일치하지않은 경우 classcastexception이 발생할수있다
        * */
        System.out.println("클래스타입 형변환확인===");

        ((cat)a1).jump();
        ((tiger)a2).bite();

//        ((tiger)a1).bite(); //고양이는 호랑이가 될수없다
        /*레퍼런스 변수가 참조하는 실제 인스턴스가 원하는 타입과 맞는지 비교하는 연산자 instanceof*/
        System.out.println("instanceof 확인===");
        System.out.println("a1이tiger인지 확인:"+(a1 instanceof tiger));
        System.out.println("a1이 cat인지 확인:"+(a1 instanceof cat));
        /*상속 받은 타입도 함께 가지고있다(다향성)*/
        System.out.println("a1이 animal인지 확인"+(a1 instanceof animal));
        /*모든 클래스는 object의 후손이다*/
        System.out.println("a1이 object인지 확인"+(a1 instanceof Object));

        if (a1 instanceof cat){
            ((cat) a1).jump();
        }
        if (a1 instanceof cat){
            ((tiger)a1).bite();
        }
        /*클래스의 업캐스팅과 다운캐스팅
        * up-casting:상위 타입으로 형변환
        * down-casting:하위타입으로 형변환
        * */
        animal animal=(animal)new  cat(); //업 캐스팅 명시적 형변환
        animal animal2=new cat(); //업 캐스팅 묵시적 형변환

        cat cat1=(cat) animal1; //다운 캐스팅 명시적 형변환
//        cat cat2=animal1; //다운캐스팅은 묵시적 형변환 불가



    }
}
