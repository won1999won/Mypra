package com.ohgiraffers.test.controller;

import com.ohgiraffers.hw2.model.comparator.AscCatagory;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;

public class BookManager {
    public static ArrayList<BookDTO> bookArray;
    BookDTO bookDTO = new BookDTO();
    Scanner sc;
    AscCatagory ascCatagory;

    public void addBook(BookDTO book) {
        bookArray.add(bookDTO);
    }

    public void deleteBook(int index) {
        bookArray.remove(index);

    }

    public int serchBook(String btitle) {
        if (bookArray.equals(btitle)) {
            System.out.println("검색결과");
            bookArray.contains(btitle);
        }
        System.out.println("해당 책이 없습니다");
        return 0;
    }

    public void printBook(int index) {
        System.out.println(bookArray.contains(index));

    }

    public void displayAll() {
        System.out.println(bookArray);
    }

    public ArrayList<BookDTO> sortedBookList(int seletct) {
        ArrayList<BookDTO> sortedList = new ArrayList<>(bookArray);
        sortedList.sort(Comparator.comparing(BookDTO::getbNo));

        return sortedList;
    }



    public void printBookList(ArrayList<BookDTO> br) {
        for (BookDTO book : br) {
            System.out.println(book);


        }
    }
}
