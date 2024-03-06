package com.ohgiraffers.section01.generic;

public class generictest<T>{

    private T value;
    public void setValue(T value){
        this.value=value;
    }
    public T getValue(){
        return this.value;
    }
}
