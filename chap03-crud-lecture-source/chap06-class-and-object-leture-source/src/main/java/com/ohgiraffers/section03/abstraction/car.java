package com.ohgiraffers.section03.abstraction;

public class car {

    private boolean ison;    //초기값 은 시동이 꺼진 false상태
    private int speed;

    public void startup() {
        if (ison) {
            System.out.println("시동이 이미 걸린상태");
        } else {
            this.ison = true;
            System.out.println("시동이 걸림");
        }
    }

    public void go() {
        if (ison) {
            System.out.println("출발");
            this.speed += 10;
            System.out.println("현재 시속:" + this.speed + "km/h");
        } else {
            System.out.println("시동이 꺼져있다");
        }


    }

    public void fast() {
        if (ison) {
            System.out.println("가속");
            this.speed += 90;
            System.out.println("현재시속:" + this.speed + "km/h");
        } else {
            System.out.println("시동이 꺼져있다");
        }
    }

    public void stop() {
        if (ison) {
            if (this.speed > 0) {
                this.speed = 0;
                System.out.println("브레이크 활성화,정지");
                {

                }
            } else {
                System.out.println("이미 정지 된 상태");
            }
        } else {
            System.out.println("시동이 꺼져있음");
        }
    }

    public void turnoff() {
        if (ison) {
            if (this.speed > 0) {
                System.out.println("주행중,시동정지불가");
            } else {
                this.ison = false;
                System.out.println("시동을 끔");
            }
        } else {
            System.out.println("이미 시동이꺼짐");
        }
    }

    public void drift() {
        if (ison) {
            this.speed -= 10;
            System.out.println("관성 드리프트!!");
        } else {
            System.out.println("시동이 꺼져있다");
        }
    }

    public void jump() {
        if (ison) {
            if (speed >= 90) {
                System.out.println("차가 날았다!!!");
            } else if(speed<90){
                System.out.println("속도가 부족하다!");
            }else {
                System.out.println("시동이 꺼져있다");
            }
        }
    }
}
