package com.ohgiraffers.section01.polymorphism;

public class Application2 {
    public static void main(String[] args) {
        animal[] animals=new animal[5];
        animals[0]=new cat();
        animals[1]=new tiger();
        animals[2]=new cat();
        animals[3]=new tiger();
        animals[4]=new cat();

        /*각 클래스별로 고유한 메소드를 동작시키게 하기위해선
        * 다운 캐스팅을 명시적으로 해줘야하는데
        * 클래스캐스트익셉션을 방지하기 위해선 instanceof 연산자를 이용해야한다
        * */
        for (int i=0;i<animals.length;i++){
            animals[i].cry();
        }
        for (int i=0;i<animals.length;i++){
            if (animals[i]instanceof cat){
                ((cat) animals[i]).jump();
            }else if(animals[i] instanceof tiger){
                ((tiger)animals[i]).bite();
            }else {
                System.out.println("뭐야 이건");
            }
        }for (int i=0;i<animals.length;i++){
            if (animals[i] instanceof cat){
                ((cat) animals[i]).run();
            }else if (animals[i] instanceof tiger){
                ((tiger)animals[i]).run();
            }else {
                System.out.println("error");
            }
        }
    }
}
