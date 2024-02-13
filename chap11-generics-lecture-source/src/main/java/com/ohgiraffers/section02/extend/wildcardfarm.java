package com.ohgiraffers.section02.extend;

public class wildcardfarm {

    /*토끼농장에있는 토끼가 어떤 토끼인지 상관하지않는다*/
    public void anytype(rabbitfarm<?> farm){
        farm.getAnimal().cry();
    }

    /*토끼 농장의 토끼는 버니또는 그 후손으로 만들어진 토끼농장만 메게변수로 사용가능*/
    public void expy(rabbitfarm<? extends bunny>farm){
        farm.getAnimal().cry();
    }

    /*bunny이거나 그 부모타입으로 만들어진 토끼농장만 매개변수로 사용가능*/
    public void supertype(rabbitfarm<? super bunny>farm){
        farm.getAnimal().cry();
    }
}
