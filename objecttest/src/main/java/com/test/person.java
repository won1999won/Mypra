package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class person {
    Scanner sc = new Scanner(System.in);
    the_dog DOG;
    Application APP = new Application();
    /*
     * 사람의 속성:이름(String)나이(int)국적(String)강아지(클래스)---캡슐화*/

    private String name;
    private int age;
    private String nation;

    private String Ablilty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNation() {
        return nation;
    }

    public void setNation() {
        this.nation = nation;
        String pnation[] = {"한국", "일본", "중국", "홍콩", "터키"};
        String pin = sc.nextLine();
        for (int i = 0; i < pnation.length; i++) {

            if (pnation[i].equals(pin)) {
                nation = pin;
                System.out.println("설정완료 국적을" + nation + "으로 변경");
                return;
            }
        }
        nation = "한국";
        System.out.println("잘못된 입력,설정을 " + nation + "으로 변경");

    }

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*강아지의 이름을 입력받고 입력받은 이름을 속성으로 강아지 객제 생성하여 사람의 강아지로 설정*/


    public void adoptDog() {
        System.out.print("강아지의 이름을 입력:");
        String dogname = sc.next();
        DOG= new the_dog(dogname);

    }

    public void mydog() {
        System.out.println("강아지이름:"+DOG.dogname+"재주"+ Arrays.toString(DOG.getEx()));
    }

    public void teachDog(String[] Ablilty) {
        /*재주설정*/
        if (DOG.dogname != null) {
            DOG.learnAblilty(Ablilty);


        }



    }
    public  void ordertodog(){
        DOG.doSomTingVoid(sc.next());


    }

    public void infom() {
        System.out.println("이름" + name + "나이" + age + "국적" + nation);

    }
}



