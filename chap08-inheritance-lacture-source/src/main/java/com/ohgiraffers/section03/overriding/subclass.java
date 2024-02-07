package com.ohgiraffers.section03.overriding;

public class subclass extends superclass{
/*메소드이름 변경 에러*/
//    @Override
//    public void me2(int num){}
    /*리턴타입 변경에러*/
//    @Override
//    public int method (int num){return 0;}
    /*갯수,타입 변경에러*/
//    @Override
//    public void method(int num,String num){}

    @Override
    public void method(int num){}

    /*프라이빗과 파이널은 오버라이딩 불가*/
//    @Override
//    private void preme(){}
//    @Override
//    public final void finalme(){}


    /*부모 메소드의 접근제한자와 같거나 더 넓은 범위로 오버라이딩 가능*/
//    @Override
//    void prome(){}//더 좁은 범위로 불가능

//    @Override
//    protected void prome(){}//같은범위 가능

    @Override
    public void prome(){}//더 넓은 범위 가능
}
