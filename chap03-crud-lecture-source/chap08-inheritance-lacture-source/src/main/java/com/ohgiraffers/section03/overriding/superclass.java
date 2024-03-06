package com.ohgiraffers.section03.overriding;

public class superclass {
    /*
    * [오버라이딩 성립요건]
    *
    * 1.메소드의 이름이 동일해야합니다
    * 2.메소드의 리턴 타입이 동일 해야한다
    * 3.매개변수의 타입 갯수 순서가 동일해야한다
    * 4.프라이빗 메소드는 접근이 불가능 하기 때문에 오버라이딩 불가능
    * 5.파이널 키워드가 사용된 메소느는 오버라이딩이 불가능
    * 6.접근 제한자는 부모메소드와 같거나 더 넓은 범위여야한다
    * 7.예외처리는 같은 예외이거나 더 구체적(하위)인 에외를 처리해야한다
    * */

    public void method(int num){}
    private void privame(){}
    public final void finalme(){}
    protected void prome(){}
}
