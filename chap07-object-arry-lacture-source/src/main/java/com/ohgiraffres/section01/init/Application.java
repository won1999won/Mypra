package com.ohgiraffres.section01.init;

public class Application {
    public static void main(String[] args) {
        /*객체 배열은 레퍼런스 변수에 대한 배열이다
        * 생성한 인스턴스도 배열을 이용해서 관리하면
        * 동잃나 타입의 여러개의 인스턴스를 각각 취급하지않고 연속처리할수있어서 유용하다
        * 또한 반환값은 1개의 값만 반환할수있기 때문에
        * 동일한타입의 여러 인스턴스를 반환해야 하는경우 객체배열을 이용할수있다*/

        car car1=new car("말보르기니",50);
        car car2=new car("농스농이스",90);
        car car3=new car("쉥보레",910);
        car car4=new car("빼라리",9);
        car car5=new car("넌또뭐야",990);


        car1.drrivemaxspeed();
        car2.drrivemaxspeed();
        car3.drrivemaxspeed();
        car4.drrivemaxspeed();
        car5.drrivemaxspeed();


        /*car 타입의 인스턴스 주소를 보관할 5칸배열할당*/
        car[] caararry=new car[5];

        caararry[0]=new car("도라리",99);
        caararry[1]=new car("농농스이스",99);
        caararry[2]=new car("넌또뭐야",99);
        caararry[3]=new car("말보르기니",99);
        caararry[4]=new car("쉿보레",99);

        for (int i=0;i<caararry.length;i++){
            caararry[i].drrivemaxspeed();

        }
        car[] cararray2={
                new car("aaa",90)
                ,new car("bbb",19)
                ,new car("ccc",11)
                ,new car("ddd",124)
                ,new car("eee",66)
        };
        /*향상된 for문 도 사용가능*/
        for (car c:cararray2){
            c.drrivemaxspeed();
        }



    }
}
