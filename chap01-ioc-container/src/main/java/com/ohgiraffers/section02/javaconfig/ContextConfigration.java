package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//@Configuration:해당 클래스가 빈을 생성하는 클래스임을 표기
@Configuration
public class ContextConfigration {
//    @Bean:해당메소드의 반환값을 spring container에 bean으로 등록한다는 의미 이름 이지정시 메소드명을 빈의 id로 자동인식
    @Bean(name = "member")
    public MemberDTO getmember(){
        return new MemberDTO(1,"user01","pass01","Lion");
    }
}
