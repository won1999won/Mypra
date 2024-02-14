package com.hw1.controller;

import com.hw1.model.dto.AniBook;
import com.hw1.model.dto.Book;
import com.hw1.model.dto.CookBook;
import com.hw1.model.dto.Member;


public class LibraryManager {
    private Member mem = null;
    private Book[] blist = new Book[5];

    {
        blist[0] = new CookBook("백종원의 집밥", "김정원", "tvvnnn", true);
        blist[1] = new AniBook("쿠로코", "몰라", "어딘가 출판사", 12);
        blist[2] = new AniBook("진격거", "어느 일본인", "몰루 출판사", 18);
        blist[3] = new CookBook("집가서 밥먹고 싶어", "집밥", "우리집", false);
        blist[4] = new CookBook("집에갈래", "나", "나나", true);
    }

    public void insertMember(Member mem) {
        this.mem = mem;
    }

    public Member myinfo() {

        return mem;
    }

    public Book[] selectAll() {
        return new Book[]{blist[0]};
    }

    public Book[] searchBook(String keyword) {
        Book[] book2 = new Book[5];
        int count = 0;
        for (Book book : blist) {
            if (book != null && book.getTitle().contains(keyword)) {
                book2[count++] = book;

            }


        }
        return book2;
    }

    public int rentBook(int index) {
        int result = 0;
        if (blist[index] != null && blist[index] instanceof AniBook) {
            AniBook aniBook = (AniBook) blist[index];
            if (aniBook.getAccessAge() > mem.getAge()) {
                return result = 1;
            }
        }
        if (blist[index] != null && blist[index] instanceof CookBook) {
            CookBook cookBook = (CookBook) blist[index];
            if (cookBook.isCoupon()) {
                mem.setCouponCount(mem.getCouponCount() + 1);
                return result = 2;
            }

        }
        return result;
    }

    public Member getMem() {
        return mem;
    }

    public void setMem(Member mem) {
        this.mem = mem;
    }

    public Book[] getBlist() {
        return blist;
    }

    public void setBlist(Book[] blist) {
        this.blist = blist;
    }

}

