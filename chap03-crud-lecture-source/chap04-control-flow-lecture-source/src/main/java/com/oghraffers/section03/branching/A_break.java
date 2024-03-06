package com.oghraffers.section03.branching;

public class A_break {
    /*break문은 반복문 내에서 사용된다
     * 반복문의 조건문 판단결과와 상관없이 반복문을 빠져나올때 사용된다
     * 일반적으로 if(조건식){break;}저럼 사용된다
     * 단,swith문은 반복문이아니지만 예외적으로 사용된다
     * */

    public void simplebraekstatement() {
        int sum = 0;
        int i = 1;
        while (true) {
            sum += i;
            if (i == 100) {
                break; //i가 100인 조건을 만족할경우 반복문 이탈
            }
            i++;
        }
        System.out.println("1부터 100까지의 합:" + sum);
    }

    public void simplebreakstatment2() {
        /*break는 모든 반복문을 종료하는게 아닌
         * 자신에게 가장 인접한 반복문만 종료시킨다*/
        for (int dan = 2; dan < 10; dan++) {
            int su=0;
            for (su = 1; su < 10;su++) {
                if (su > 5) ;
                {
                    break;


                }

            }
            System.out.println(dan + "*" + su + "=" + (dan * su));
        }


    }
    public void testjump(){
        label:
        for(;;){
            for (int i=0;i<10;i++){
                System.out.println(i);
                if (i == 3) {
                    break label;
                }
            }
        }
    }
}
