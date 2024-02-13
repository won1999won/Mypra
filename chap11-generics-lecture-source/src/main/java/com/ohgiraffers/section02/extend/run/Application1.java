package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {

        /*토끼나 토끼의 후손만 타입으로 사용가능 그외에는 컴파일에서 에러*/

//        rabbitfarm<Animal> farm1= new rabbitfarm<>();
//        rabbitfarm<mammal> farm1= new rabbitfarm<>();
//        rabbitfarm<snake> farm1= new rabbitfarm<>();
        rabbitfarm<rabbit> farm1= new rabbitfarm<>();
        rabbitfarm<bunny> farm2=new rabbitfarm();
        rabbitfarm<drunkenbunny> farm3=new rabbitfarm();

//        farm4.setAnimal(new snake());
        farm1.setAnimal(new rabbit());
        farm1.getAnimal().cry();


        farm2.setAnimal(new bunny());
        farm2.getAnimal().cry();

        /*제네릭을 사용해서 올바른 타입을 타입변수로 지정하는경우
        * 인스턴스 내부의 타입 자체가 rabbit타입을 가지고 있는것이 보장되어 형변환 생략가능*/

        farm3.setAnimal(new drunkenbunny());
        farm3.getAnimal().cry();


    }
}
