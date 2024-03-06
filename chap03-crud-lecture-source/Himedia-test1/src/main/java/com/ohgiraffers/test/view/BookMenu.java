package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {
    private Scanner sc;
    private BookManager bm;

    BookDTO bookDTO;


    public BookMenu() {

    }

    public void menu() {
        System.out.println("메인메뉴입니다");
        System.out.println("1.책 더하기 2.책 지우기 3.책 검색 4.전부보기 5.책 정렬 6.정렬된 책 보기");
        for (; ; ) {
            int seletint= sc.nextInt();

            switch (seletint) {
                case 1:
                    inputBook();
                    break;
                case 2:
                    bm.deleteBook(sc.nextInt());
                    break;
                case 3:
                    bm.serchBook(sc.next());
                    break;
                case 4:
                    bm.displayAll();
                    break;
                case 5:
                    sc.nextLine();
                    bm.sortedBookList(sc.nextInt());
                    sc.nextLine();
                    break;
                case 6:
                    bm.printBookList(BookManager.bookArray);
                    break;
                default:
                    System.out.println("잘못된 입력입니다");

            }
        }
    }

    public BookDTO inputBook() {
        bookDTO.setbNo(sc.nextInt());
        bookDTO.setAuthor(sc.next());
        bookDTO.setCatagory(sc.nextInt());
        inputBookTilte();


        return null;
    }

    public String inputBookTilte() {

        return sc.next();
    }


}
