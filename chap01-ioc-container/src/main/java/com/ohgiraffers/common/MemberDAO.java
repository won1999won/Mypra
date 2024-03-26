package com.ohgiraffers.common;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

//@Controller
//@Service
//@Repository

@Component
public class MemberDAO {
    private  final Map<Integer,MemberDTO>memberDTOMap;

    public MemberDAO() {
        memberDTOMap=new HashMap<>();
        memberDTOMap.put(1,new MemberDTO(1,"user01","pass01","Lion"));
        memberDTOMap.put(2,new MemberDTO(2,"user02","pass02","Cat"));

    }
    public MemberDTO selctmember(int sequence){
        return memberDTOMap.get(sequence);
    }
    public  boolean insertmember(MemberDTO newMember){
        int before= memberDTOMap.size();
        memberDTOMap.put(newMember.getSequence(), newMember);
        int after= memberDTOMap.size();
        return after>before? true:false;
    }
}
