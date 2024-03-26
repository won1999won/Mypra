package com.ohgiraffers.section01.autowired.subsection02.constructor;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("bookServiceConstructor")
public class BookService {
   private BookDAO bookDAO;
//   BookDAO 타입의 빈 객체를 생성자에 자동주입
   @Autowired
   public BookService(BookDAO bookDAO){
       this.bookDAO=bookDAO;
   }
    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectidBooklist();
    }
    public  BookDTO searchBookBySequence(int sequnce){
        return  bookDAO.seletcOneBook(sequnce);
    }

}
