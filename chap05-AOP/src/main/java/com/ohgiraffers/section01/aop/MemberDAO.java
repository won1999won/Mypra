package com.ohgiraffers.section01.aop;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MemberDAO {
    private final Map<Long,MemberDTO>memberDTOMap;
    public MemberDAO(){
        memberDTOMap=new HashMap<>();
        memberDTOMap.put(1L,new MemberDTO(1L,"kim"));
        memberDTOMap.put(2L,new MemberDTO(2L,"sung"));
    }
    public Map<Long,MemberDTO>selectmembers(){
        return memberDTOMap;
    }
    public MemberDTO selectmember(Long id){
        MemberDTO ret=memberDTOMap.get(id);
        if (ret==null)throw new RuntimeException("none");
        return ret;
    }
}
