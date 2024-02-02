package com.ohgiraffers.section03.copy;

public class Application1 {
    public static void main(String[] args) {

        /*
         * 배열의 복사의 종류
         * 1.앝은 복사(shallow copy):stack의 주소값만 복사
         * 2.깊은 복사(deep copy):heap의 배열에 저장된 값을 복사
         * */

        /*얕은 복사는 stack에 저작되어있는 배열의 주소값만 보사한다
         * 따라서 두개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고있다
         * 하나의 레버런스 변수에 저장된 주소값을 가지고 배열의 내용을 수정하게되면
         * 다른 레버런스 변수로 접근했을때도 변경된 값이 반영되어있다*/

        int[] ogcopyarr = {95, 96, 97, 98, 99};
        int[] copyarr = ogcopyarr;
        System.out.println(ogcopyarr.hashCode());
        System.out.println(copyarr.hashCode());


        System.out.println("변경전" + ogcopyarr[4]);
        System.out.println("변경값" + copyarr[4]);
        copyarr[4] = 90;
        System.out.println("변경전" + ogcopyarr[4]);
        System.out.println("변경값" + copyarr[4]);

        /*얕은 복사의 활용
         * 주로 메소드 호출시 인자로 사용하는 경우롸
         * 리턴값으로 동일한 배열을 반환하고 싶은경우 사용한다
         * */

        String[] team = {"나", "둥","단","풍"};
        System.out.println("팀 배열 해쉬코드:"+team.hashCode());
        pitarr(team);


        }
        public static void pitarr(String[]arr){
            System.out.println("pitarr()매개변수 해쉬코드():"+arr.hashCode());

            for (int i=0;i<arr.length;i++){
                arr[i]+="님";
                System.out.println(arr[i]+" ");

            }

            System.out.println();
        }




        public static String[]getarr(){
        String[] lunch=new String[]{"a,b,c,d"};
        System.out.println("getarr()의 배열 해쉬코드:"+lunch.hashCode());

        return lunch;

        }
    /*1 인자와 매개변수로 활용*/
//    printarr(team);


    /* 2 리턴값으로 활용 */
    String[]arrfomemethod=getarr();




    }


