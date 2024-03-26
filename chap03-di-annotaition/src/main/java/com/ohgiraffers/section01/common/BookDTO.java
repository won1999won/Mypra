package com.ohgiraffers.section01.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BookDTO {
    private  int sequence;
    private int inbn;
    private String title;
    private String Author;

    private  String publisher;
    private Date cratedDate;
}
