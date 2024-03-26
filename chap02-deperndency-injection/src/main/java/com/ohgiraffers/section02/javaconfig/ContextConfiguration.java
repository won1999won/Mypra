package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20,"110-231-4231421");
    }
    @Bean
    public MemberDTO memberDTOGenerator(){
//        생성자주입
//        MemberDTO생성자를 통해 어카운트 생성하는 메소드를 호출한 리턴값을 전달해서 bean조립
//        return new MemberDTO(1,"dog","dog@gmail.com",accountGenerator());

//        setter주입
//        setter를 통해 어카운트를 생성하는 메소드를 호출한 리턴값을 전달하여 bean조립
        MemberDTO memberDTO=new MemberDTO();
        memberDTO.setSequence(1);
        memberDTO.setName("dog");
        memberDTO.setEmail("dog@gmail.com");
        memberDTO.setPersonalAccount(accountGenerator());
        return memberDTO;

    }

}
