package com.ohgiraffers.section05.overloading;

public class overloadingtest {
    /*오버로딩의 사용이유
     * 매개변수의 종류벌로 메소드 내용을 다르게 작성해야 하는 경우가 종종있다
     * 이때 동일한 기능의 메소드를 매개변수에따라 다르게 이름을 정의하면 복잡하고 관리하기 매우까다롭다
     * 따라서 동일한 이름으로 다양한 종류의 매개변수에따라 처리해야하는 여러 메소드를
     * 동일한 이름으로 관리하기위해 사용하는 기술을 오버로딩이라한다
     *
     * 오버로딩의 조건
     * 동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입 갯수 순거를 다르게 작성하여 한클래스내에 동일한 이름의 메소드를 여러개 작성할수있도록한다
     * 메소드의 시그니쳐가 다르면 다른 메소드로 ㅇ니식하기때문이다
     * 즉,시그니쳐 중 메소드 이름은 동일해야하기때문에 파라미터 선언부가 다르게 작성되어야 오버로딩이 성립된다
     *
     * 메소드의 시그니처
     * public void method(int num){}이라는 메소드가 있다고 할때
     * 메소드명과 파라미터(매개변수) 선언부인 method(int num)부분이 메소드의 시그니처이다
     * 메소드의 시그니처가 달라야 오버로딩이 성립되므로 접근제한자나 반환타입은 오버로딩 성립요건에 해당안됨
     * */


    public void test() {
    }
    /*메소드의 시그니처가 동일한경우 에러발생*/
//    public void test(){}
//    private void test(){} //접근제한자는 시그니처에 포함안됨

//    public int test(){return 0;} //반환형은 시그니처에 포함되지않음

    public void test(int num) {
    }//파라미터 선언부는 메소드 시그니처에 해당된다

    //    public void test(int num2){} //매개변수 이름은 메소드 시그니처에 포함안됨
    public void test(int num1, int num2) {
    } //매개변수 갯수에따른 오버로드 성립

    public void test(int num1, String name) {
    } //매개변수 타입에따른 오버로드 성립

    public void test(String name, int num) {
    } //매개변수 순서에따른 오버로딩 성립
}
