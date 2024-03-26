package com.ohgiraffers.section02.common;

import org.springframework.stereotype.Component;

@Component
public class Squirtle implements Pokemon{
    @Override
    public void attak() {
        System.out.println("꼬북이의 물대포!");
    }
}
