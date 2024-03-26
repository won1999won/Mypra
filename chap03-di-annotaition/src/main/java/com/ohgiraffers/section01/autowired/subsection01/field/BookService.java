package com.ohgiraffers.section01.autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service:@Component 의 세분화
@Service("bookServiceField")
public class BookService {
//    BookDAO타입의 빈(bean) 객채를 이 프로퍼티에 자동으로 주입
    @Autowired
    private BookDAO bookDAO;

    public List<BookDTO> selectAllBooks(){
        return bookDAO.selectidBooklist();
    }
    public  BookDTO searchBookBySequence(int sequnce){
        return  bookDAO.seletcOneBook(sequnce);
    }
}
