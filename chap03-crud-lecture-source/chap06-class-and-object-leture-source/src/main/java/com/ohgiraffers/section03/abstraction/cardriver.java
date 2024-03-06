package com.ohgiraffers.section03.abstraction;

public class cardriver {

    private final car car=new car();


    public void startup(){
        car.startup();

    }
    public void stepaccelator(){
        car.go();
    }
    public void stepbraek(){
        car.stop();
    }
    public void turnoff(){
        car.turnoff();
    }
    public void fast(){
        car.fast();
    }
    public void drift(){
        car.drift();
    }
    public void jump(){
        car.jump();
    }
}
