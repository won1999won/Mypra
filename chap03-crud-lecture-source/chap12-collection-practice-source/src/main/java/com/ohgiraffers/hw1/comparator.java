package com.ohgiraffers.hw1;

import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.Comparator;

  class AscBookNo implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO book1, BookDTO book2) {
        int result=0;
        if (book1.getbNo()>book2.getbNo()) {
            result = 1;

        }else if (book1.getbNo()<book2.getbNo()){
            result=-1;
        }else {
            result=0;
        }
        return result;
    }
}

 class DescBookNo implements Comparator<BookDTO> {
    @Override
    public int compare(BookDTO book1, BookDTO book2) {
        int result=0;
        if (book1.getbNo()<book2.getbNo()) {
            result = 1;

        }else if (book1.getbNo()>book2.getbNo()){
            result=-1;
        }else {
            result=0;
        }
        return result;
    }
 }



