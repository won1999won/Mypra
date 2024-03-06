package com.ohgiraffers.hw2.model.comparator;

import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Comparator;

public class AscCatagory {
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
            return book1.getbNo();
        }
    }
}
