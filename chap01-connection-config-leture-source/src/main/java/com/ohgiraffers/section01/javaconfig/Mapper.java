package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Select;

public interface Mapper {
    @Select("select CURDATE() from Dual")
    java.util.Date selectSysdate();//쿼리문 식별자 역할의 메소드
}
