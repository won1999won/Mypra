package com.ohgiraffers.section02.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary //프라이머리는 동일한 타입의 빈이 여러개 있을경우 연결시 우선타입으로 가져가 오류를 방지,동일 타입상 한개만 가질수있다
public class Charmander implements Pokemon{
    @Override
    public void attak() {
        System.out.println("파이리의 불꼿세례");
    }
}
