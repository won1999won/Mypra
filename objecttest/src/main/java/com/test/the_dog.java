package com.test;

import java.util.Scanner;

public class the_dog {
    person ps;
    Scanner sc = new Scanner(System.in);
    public String dogname;
    public String[] ex;

    private String knoow;

    Application app;
    Application[] teachningability;

    public the_dog() {

    }

    public the_dog(Application app, Application[] teachningability) {
        this.app = app;
        this.teachningability = teachningability;
    }


    public String getName() {
        return dogname;
    }

    public void setName() {
        this.dogname = dogname;
    }

    public String[] getEx() {
        return ex;
    }

    public void setEx() {this.ex = ex;
    }

    public the_dog(String dogname) {
        this.dogname = dogname;
    }

    public the_dog(String dogname, String[] ex) {
        this.dogname = dogname;


    }

    public void learnAblilty(String[] Ablilty) {
        this.ex = Ablilty;

    }

    /*도그의 반환타입인 void인 메소드 호출*/
    public void doSomTingVoid(String knoow) {
        boolean stop=false;



        /*스위치문*/
        switch (knoow) {
            case "앉아", "서", "돌아":
                for (String s : ex) {
                    if (s.equals(knoow)) {
                        System.out.println(dogname + "는" + s + "를 했다");
                        stop = true;
                        break;
                    }
                }
                break;


        }
        if (!stop)
            System.out.println("실행불가한 명령");



    }
}

