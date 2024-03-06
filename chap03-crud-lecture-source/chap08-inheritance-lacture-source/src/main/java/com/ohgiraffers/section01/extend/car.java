package com.ohgiraffers.section01.extend;

public class car {
    private boolean runningstatus;


    public car(){
        System.out.println("car기본 클래스 호출");

    }
    public void run(){
        runningstatus=true;
        System.out.println("질주");
    }
    public void soundhorn(){
        if (isRunningstatus()){
            System.out.println(" 애옹");
        }else {
            System.out.println("미주행중");
        }

    }
//    private boolean isrunning(){}// private는 자식클래스에 접근할수없다
    protected boolean isRunningstatus(){
        /*자동차의 주행상태를 반환기능*/
        return runningstatus;
    }
    public void stop(){
        runningstatus=false;
        System.out.println("정지");
    }
}
