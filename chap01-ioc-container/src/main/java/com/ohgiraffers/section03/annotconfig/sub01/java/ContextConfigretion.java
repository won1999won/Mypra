package com.ohgiraffers.section03.annotconfig.sub01.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages ="com.ohgiraffers")
//ComponentScan=base packge로 설정된 하위 경로에 특정 어노테이션을 가지고있는 클래스를 bean으로 등록하는 기능
//basePackages 를 성정하지않으면 동일 패키지내에서만 탐색
//@Component가 작성된 클래스를 인식하여 bean으로 등록
public class ContextConfigretion {


}
