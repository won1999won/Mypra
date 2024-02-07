package com.greedy.level02.nomal.book.run;

import com.greedy.level02.nomal.book.model.vo.BookVO;

public class Application {

    public static void main(String[] args) {
        BookVO book1 = new BookVO();
        book1.printInformation();

        BookVO book2 = new BookVO("밥먹는법", "너모 출판사", "대 식가");
        book2.printInformation();

        BookVO book3 = new BookVO("잘자는법", "굿나잇", "잘 자요", 30000, 0.1);
        book3.printInformation();

    }

}
