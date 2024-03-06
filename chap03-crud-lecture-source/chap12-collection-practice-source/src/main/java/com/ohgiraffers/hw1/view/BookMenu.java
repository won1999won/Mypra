package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {
    private Scanner sc;

    private BookManager bm;
    public BookMenu(){}
    public void mainMenu(){
        int selectMenu=sc.nextInt();
        switch (selectMenu){
            case 1:
                for (;;){
                    inputBook();
                    break;
                }
            case 2:
                for (;;){
                    inputBookNo();
                    break;
                }
            case 3:
                for (;;){
                    inputTitle();
                    break;
                }
            case 4:
                for (;;){
                    selectSortedBook();
                }
        }

    }
    public BookDTO inputBook(){
        BookDTO bookDTO=new BookDTO();
        bookDTO.setbNo(sc.nextInt());
        bookDTO.setCategory(sc.nextInt());
        bookDTO.setAuthor(sc.next());
        bookDTO.setTitle(sc.next());



        return inputBook();
    }
    public int inputBookNo(){
        int deleteNo= sc.nextInt();
        return deleteNo;
    }
    public String inputTitle(){
        String intiteld= sc.next();
        return intiteld;
    }
    public List<BookDTO>selectSortedBook(){
        BookManager bookManager=new BookManager();
        int sortselet=sc.nextInt();
        System.out.println("정렬방식 선택 1.번호오름차 2.번호내림차 3.이름오름차 4.이름내림차");
        switch (sortselet){
            case 1:
                bookManager.sortedBookList(1);
            case 2:
                bookManager.sortedBookList(2);
            case 3:
                bookManager.sortedBookList(3);
            case 4:
                bookManager.sortedBookList(4);

        }
        return selectSortedBook();
    }

}
