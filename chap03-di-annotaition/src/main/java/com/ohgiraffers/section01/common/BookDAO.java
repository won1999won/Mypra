package com.ohgiraffers.section01.common;

import java.util.List;

public interface BookDAO {
//    도서정보 전체조회
    List<BookDTO>selectidBooklist();
//    번호로 조회
    BookDTO seletcOneBook(int sequence);
}
