package com.ohgiraffers.section01.xmlconfig;

import java.util.List;

public class PrintResult {
    public void printMenuList(List<MenuDTO> menuList) {

        for(MenuDTO menu : menuList) {
            System.out.println(menu);
        }
    }


    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "메뉴 목록 조회를 실패하였습니다."; break;
            case "selectOne": errorMessage = "메뉴 조회를 실패하였습니다."; break;
            case "insert":errorMessage="등록실패";break;
            case  "update":errorMessage="수정실패";break;
            case  "delete":errorMessage="삭제실패";break;

        }
        System.out.println(errorMessage);
    }

    public void printMenu(MenuDTO menu) {
        System.out.println(menu);
    }
    public  void  printSuccessMessage(String successCode){
        String successMassage="";
        switch (successCode){
            case "insert":successMassage="등록성공";break;
            case "update":successMassage="수정성공";break;
            case "delete":successMassage="삭제성공";break;
        }
        System.out.println(successMassage);
    }
}
