package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {


        /*상속은 현실의 상속과 비슷한 개념이다
         * 부모클래스의 멤버를 자식클래스가 물려봗아 자신의 것처럼 사용할수있게하는 기술
         *
         *
         * 하지만 단순히 물려받는개념에서 나아가 자바에서의 상속은 부모클래스의 확장의 개념을 가진다
         * 물려받아서 자신의 것처럼 사용할수있으며 추가적인 멤버작성도 가능하다
         * 특히 메소드 오버라이딩을 이용해 부모가 가진 메소드를 재정의 할수있다
         *
         * 메소드 오버라이딩
         * 부모가 가지는 메소드 선언부를 그대로 사용하면서
         * 자식 클래스가 정의한 메소드 대로 동작하도록 구현부를 새롭게 다시 작성하는 기술이다
         * 메소드 재정의를 하면 메소드 호출시 재정의된 메소드가 우선작동한다
         *
         *
         * 상속의 이점
         * 1.새로운 클래스 작성시 기존의 작성한 클래스를 재사용할수있다
         *   1-1 재사용시 생산성을 크게 향상할수있다
         *   1-2 공통적으로사용하는 코드가 부모클래스에 존재하면 수정하상 발생시 부모클래스만 수정해도 전체적으로 적용된다
         *
         * 2.클래스간의 계층 관계가 형성되며 다형성의 문법적인 토대가 된다
         *
         * 상속의 단점
         * 1.부모 클래스의 기능을 추가/변경할경우 자식클래스가 정상작동하는지 예측필요
         *   상속구조가 복잡해 질수록 영향의 예측이 힘들어지며 유지보수성이증가하는 장점과 동시에 악역향을 준다
         *
         * 2.부모클랫의 변경이 쉽지않다
         *    자식클래스ㅇ에서 중요하게 사용되는 기능일경우 부모 클래스변경시 자식클래스에 모두 영향을 줄수있다
         * 3.부모클래스에서는 의미 있던기능이 자식 클래스에서는 무의미하게 될수있다
         *
         *
         * 상속은 재상용이라는 장법만보면 오용의 가능성이있기에 유지보수에 좋이낳은 코드를 작성할 확률이 높다
         * 상속은 IS-A관계로 구분되는 경우에만 사용해야한다*/

        car car = new car();

        car.soundhorn();
        car.run();
        car.soundhorn();
        car.run();
        car.stop();
        car.soundhorn();

        /*firecar is a car(o)/car is a firecar(x)
        * rachingcar is a car/car is a racingcar
        * */
        firecar firecar=new firecar();

        firecar.soundhorn();
        firecar.run();
        firecar.soundhorn();
        firecar.stop();
        firecar.soundhorn();
        firecar.stop();
        firecar.soundhorn();
//        firecar.spraywater();

        RacingCar racingCar=new RacingCar();
        racingCar.soundhorn();
        racingCar.run();
        racingCar.soundhorn();
        racingCar.stop();
        racingCar.soundhorn();
    }
}
