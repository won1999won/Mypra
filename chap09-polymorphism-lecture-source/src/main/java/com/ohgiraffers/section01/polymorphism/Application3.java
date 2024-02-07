package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        Application3 app3=new Application3();

        animal animal1=new cat();
        animal animal2=new tiger();

        app3.feed(animal1); //동일타입이기에 가능
        app3.feed(animal2);

        cat animal3=new cat();
        tiger animal4=new tiger();

        app3.feed((animal) animal3); //명시적 형변환
        app3.feed((animal) animal4);

        app3.feed(animal3); //묵시적 형변환
        app3.feed(animal4);

        app3.feed(new cat());
        app3.feed(new tiger());
    }
//    public  void (animal animal){
//        animal.eat();
//    }
//    public void feed(cat cat){
//    }
//    public void feed(tiger tiger){
//
//    }
    public void feed(animal animal){
        animal.eat();
    }
}
