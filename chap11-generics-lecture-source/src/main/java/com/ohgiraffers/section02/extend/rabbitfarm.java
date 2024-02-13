package com.ohgiraffers.section02.extend;

public class rabbitfarm<T extends rabbit>{

    /*인터페이스 상속시 implements가 아닌 extend를 사용*/
//public class rabbitfarm<T implements rabbit>{}
//public class rabbitfarm<T extends rabbit>{

    /*&로 여러 타입을 동시에 지정하는 타입변수를 지정할수있다 (&로 묶어준 모든 타입에 대당되어야함)
    * 단 클래스는 하나만 지정할수있으며*/
//    public void rabbitfarm<t extends rabbit & Animal>

    public T animal;
    public  rabbitfarm(){}
    public rabbitfarm(T animal){
        this.animal=animal;
    }
    public void setAnimal(T animal){
        this.animal=animal;
    }
    public T getAnimal(){
        return this.animal;
    }
}
