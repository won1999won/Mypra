package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm=new LibraryManager();
    Scanner sc=new Scanner(System.in);




        public void selectAll () {
            lm.selectAll();
            Book[] bList = lm.selectAll();

            for (Book book:bList){
                if (book !=null){
                    System.out.println(book);
                }

            }

        }
        public void searchBook () {
            String search=sc.nextLine();
            Book[] searchList = lm.searchBook(search);
            for (Book book:searchList) {
                if (book != null) {
                    System.out.println(book);
                }
            }


        }
        public void rentBook () {
            lm.selectAll();
            System.out.println("대여할 도서를 선택:");
            int rent= sc.nextInt();
            switch (lm.rentBook(rent)){
                case 0:
                    System.out.println("성공적으로 대여되었습니다");
                    break;
                case 1:
                    System.out.println("나이제한으로 대여불가능합니다");
                    break;
                case 2:
                    System.out.println("성공적으로 대여되었습니다 마이페이지를 확인하세요");
                    break;

            }

        }

        public LibraryManager getLm () {
            return lm;
        }

        public void setLm (LibraryManager lm){
            this.lm = lm;
        }

        public Scanner getSc () {
            return sc;
        }

        public void setSc (Scanner sc){
            this.sc = sc;
        }
    public void mainMenu() {
        System.out.println("이름입력");
        String name = sc.nextLine();
        System.out.println("나이");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("성별");
        char gender = sc.nextLine().charAt(0);
        Member member=new Member(name, age, gender);
        lm.insertMember(member);
        while (true){

            System.out.println("====메뉴====");
            System.out.println("1.마이페이지");
            System.out.println("2.도서 전체 기회");
            System.out.println("3.도서검색");
            System.out.println("4.도서 대여하기");
            System.out.println("0.프로그램 종료");
            int slet = sc.nextInt();


            switch (slet){
                case 1:
                    System.out.println(lm.myinfo());
                    break;
                case 2:
                    selectAll();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    rentBook();
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못된 값입니다");
                    break;


            }
        }
//        if (slet == 1) {
//            System.out.println(lm.myinfo());
//        }else if (slet==2){
//            selectAll();
//        }else if (slet==3){
//            searchBook();
//        }else if (slet==4){
//            rentBook();
//        }else if (slet==0){
//           return brake;
//        }
    }
    }

