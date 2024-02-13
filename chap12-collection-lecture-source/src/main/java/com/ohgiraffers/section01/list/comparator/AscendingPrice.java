package com.ohgiraffers.section01.list.comparator;

import com.ohgiraffers.section01.list.dto.bookDTO;

import java.util.Comparator;

public class AscendingPrice implements Comparator<bookDTO> {

    @Override
    public int compare(bookDTO o1,bookDTO o2){

        int result=0;
        if (o1.getPrice()>o2.getPrice()){
            result=1;
        }else if (o1.getPrice()< o2.getPrice()){
            result= -1;
        }else {
            result=0;
        }
        return result;

    }


}
