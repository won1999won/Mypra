package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.comparator.AscendingPrice;
import com.ohgiraffers.section01.list.dto.bookDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        List<bookDTO> booklist = new ArrayList<>();

        booklist.add(new bookDTO(1,"김삿갓","나",15000));
        booklist.add(new bookDTO(2,"김갓","11나",150050));
        booklist.add(new bookDTO(3,"삿갓","나22",150400));
        booklist.add(new bookDTO(4,"갓","1나11",150200));

        for (bookDTO book:booklist){
            System.out.println(book);
        }
        booklist.sort(new AscendingPrice());

        System.out.println("오름차");
        for (bookDTO book:booklist){
            System.out.println(book);
        }
        /*익명 클래스
        *
        * 익명 클래스는 뒤에{}를 만들어 마치 comparator인터페이스를 상속받은 클래스인데
        * 이름이 없다고 생각하고 사용하는 것
        * */

        /*인터페이스이기벵 바로 인스턴스 생성을 할수있다*/
//        booklist.sort(new Comparator<bookDTO>());

        booklist.sort(new Comparator<bookDTO>() {
            @Override
            public int compare(bookDTO o1, bookDTO o2) {
                return o1.getPrice()>=o2.getPrice()?-1:1;
            }
        });

        System.out.println("내림차순");
        for (bookDTO book:booklist){
            System.out.println(book);
        }
        booklist.sort(new Comparator<bookDTO>() {
            @Override
            public int compare(bookDTO o1, bookDTO o2) {

                /*문자열은 대소비교를 할수없다
                * 문자배열로 변경후 인덱스 하나하나를 비교해서더 큰값을 확인하는데
                * String클래스의 ComparaTo)메소드에서 정의해놓았다
                *
                * 앞이 작으면 음수
                * 같으면 0
                * 앞이 더 크면 양수*/
                return o1.getTitel().compareTo(o2.getTitel());
            }
        });
        System.out.println("제목 오름차");
        for (bookDTO book:booklist){
            System.out.println(book);
        }
        /*람다식*/
        booklist.sort((bookDTO b1,bookDTO b2)->b2.getTitel().compareTo(b1.getTitel()));




    }

}
