package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {
    private  int sequence;
    private String id;
    private  String pws;
    private  String name;

//    public MemberDTO() {
//    }

//    public MemberDTO(int sequence, String id, String pws, String name) {
//        this.sequence = sequence;
//        this.id = id;
//        this.pws = pws;
//        this.name = name;
//    }

//    public int getSequence() {
//        return sequence;
//    }
//
//    public void setSequence(int sequence) {
//        this.sequence = sequence;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getPws() {
//        return pws;
//    }
//
//    public void setPws(String pws) {
//        this.pws = pws;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

//    @Override
//    public String toString() {
//        return "MemberDTO{" +
//                "sequence=" + sequence +
//                ", id='" + id + '\'' +
//                ", pws='" + pws + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
