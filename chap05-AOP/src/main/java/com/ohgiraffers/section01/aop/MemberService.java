package com.ohgiraffers.section01.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MemberService {
    private  final MemberDAO memberDAO;
//    @Autowired 생략됨
    public MemberService(MemberDAO memberDAO){
        this.memberDAO=memberDAO;
    }
    public Map<Long,MemberDTO>selectmembers(){
        System.out.println("mem");
        return memberDAO.selectmembers();
    }
    public  MemberDTO selectMember(Long id){
        System.out.println("on");
        return memberDAO.selectmember(id);
    }
}
