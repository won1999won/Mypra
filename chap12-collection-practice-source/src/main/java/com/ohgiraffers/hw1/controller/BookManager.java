package com.ohgiraffers.hw1.controller;

import com.ohgiraffers.hw1.model.dto.BookDTO;
import com.ohgiraffers.hw1.view.BookMenu;

import java.awt.print.Book;
import java.util.*;

public class BookManager {


    BookDTO bookDTO = new BookDTO();


    private ArrayList<BookDTO> booklist() {
        return booklist();
    }

    private List book = new ArrayList();
    private Scanner sc;

    public BookManager() {
    }

    public BookManager(ArrayList book, Scanner sc) {
        this.book = book;
        this.sc = sc;
    }

    public void addBook(BookDTO book) {
        this.book.add(bookDTO);

    }

    public void deleteBook(int key) {
        if (key >= 0 && key < booklist().size()) {
            booklist().remove(key);
            System.out.println("제거 종료");
        }
        System.out.println("존재하지않는 서적");


    }

    public void searchBook(String title) {
        for (int i = 0; i < booklist().size(); i++) {
            if (booklist().equals(title)) {
                System.out.println(booklist().contains(i));
            }
            System.out.println("검색결과 없음");

        }
    }

    public void displayAll() {
        if (booklist() != null) {
            System.out.println(booklist());
        }
        System.out.println("리스트가 없습니다");
    }

    public List<BookDTO> sortedBookList(int type) {
        BookMenu bookMenu = new BookMenu();

        switch (type) {
            case 1:
                booklist().sort(new Comparator<BookDTO>() {
                    @Override
                    public int compare(BookDTO o1, BookDTO o2) {
                        int result = 0;
                        if (o1.getbNo() < o2.getbNo()) {
                            result = 1;
                        } else if (o1.getbNo() > o2.getbNo()) {
                            result = -1;
                        } else {
                            result = 0;
                        }
                        return result;
                    }

                });
            case 2:
                booklist().sort(new Comparator<BookDTO>() {
                    @Override
                    public int compare(BookDTO o1, BookDTO o2) {
                        int reult = 0;
                        if (o1.getbNo() > o2.getbNo()) {
                            reult = 1;
                        } else if (o1.getbNo() < o2.getbNo()) {
                            reult = -1;
                        } else {
                            reult = 0;
                        }
                        return 0;
                    }
                });
            case 3:
                booklist().sort(new Comparator<BookDTO>() {
                    @Override
                    public int compare(BookDTO o1, BookDTO o2) {
                        return (o1.getTitle().compareTo(o2.getTitle()));
                    }
                });
            case 4:
                booklist().sort(new Comparator<BookDTO>() {
                    @Override
                    public int compare(BookDTO o1, BookDTO o2) {
                        return (o1.getTitle().compareTo(o2.getTitle()));
                    }
                });


        }
        return null;
    }


    private void printBookList(List<BookDTO> printList) {
        if (printList.isEmpty()) {
            System.out.println("리스트 없음");
        }
        for (BookDTO bookDTO1 : printList) {
            System.out.println(bookDTO1);
        }
    }

}
