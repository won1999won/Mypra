package com.ohgiraffers.section05.Parameter;

public class parametertest {


    public void primarytypepayameter(int num) {
        System.out.println("매개변수로 전달받은값:" + num);
    }

    public void primarytypearrayparameter(int[] iarr) {
        /*
         * 배열의 주수가 전달된다
         * 즉 인자로 전달하는 배열과 매개변수로 전달받은 배열은 서로 동일한 배열을 가진다(얕은 복사)
         * */
        System.out.println("매개값:" + iarr);
        System.out.println("배열값:");
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
//        for (int i:iarr){
//            System.out.println(i);
        }
        System.out.println();
        iarr[0] = 99;

        System.out.println("변경후값");
        for (int i = 0; i < iarr.length; i++) {
            System.out.println(iarr[i]);
        }
        System.out.println();

    }

    public void classtypeparameter(Ractangle ractangle) {
        System.out.println("매개값:" + ractangle);

        System.out.println("변경전 넓이둘레==");
        ractangle.calcarea();
        ractangle.calcraund();

        ractangle.setWidth(100);
        ractangle.setHigth(100);

        System.out.println("변경후");
        ractangle.calcarea();
        ractangle.calcraund();
    }

    public void variable(String name, String... hobby) {
        System.out.println("이름" + name);
        System.out.println("취미의 갯수:" + hobby);
        System.out.println("취미");
        for (int i = 0; i < hobby.length; i++) {
            System.out.println(hobby[i] + " ");
        }
        System.out.println();

    }
    /*오버로딩시 주의
    * 둘중 어떤 메소드를 호줄하는것인지에대한 모호성으로 오류
    * 가변변수를 매개변수로 이용한 메소드는 모호성으로인해 오버로딩하지않는것이좋다*/
//    public void varia2(String...hobby){
//        System.out.println("갯수"+hobby.length);
//        System.out.println("취미");
//        for (int i=0;i<hobby.length;i++){
//            System.out.println(hobby[i]);
//        }
//
    }

