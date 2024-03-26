package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.*;
//@Component
@Repository("bookDAO") //컴포넌트의 세분화 어노테이션의 한종류로 DAO타입의 객체에 사용한다
public class BookDAOImpl implements BookDAO{
    private Map<Integer,BookDTO>bookList;
    public BookDAOImpl(){
        bookList=new HashMap<>();
        bookList.put(1,new BookDTO(1,123456,"자바","ATM","elderTree",new Date()));
        bookList.put(2,new BookDTO(2,5244123,"eldenring","mog","mikella",new Date()));

    }
    @Override
    public List<BookDTO> selectidBooklist() {
        return new ArrayList<>(bookList.values());
    }

    @Override
    public BookDTO seletcOneBook(int sequence) {
        return null;
    }
}
