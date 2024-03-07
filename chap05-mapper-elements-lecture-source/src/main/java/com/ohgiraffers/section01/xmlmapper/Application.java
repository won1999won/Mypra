package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.CategoryDTO;
import com.ohgiraffers.common.MenuandCategoryDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ElementTestService elementTestService = new ElementTestService();

        do{
            System.out.println("=========== 매퍼 element 테스트 메뉴 ==========");
            System.out.println("1. <cache> 테스트");
            System.out.println("2. <resultMap> 서브 메뉴");
            System.out.println("3. <sql> 테스트");
            System.out.println("4. <insert> 서브 메뉴");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: elementTestService.selectCacheTest(); break;
                case 2: resultMapSubMenu();break;
                case 3: elementTestService.selectSqlTest();break;
                case 4:elementTestService.insertCategoryAndMenuTest(inputMenuAndCategory());break;
            }

        }while (true);
    }

    private static MenuandCategoryDTO inputMenuAndCategory() {
        Scanner sc=new Scanner(System.in);
        System.out.println("신규 카테고리명 입력");
        String categoryName= sc.nextLine();
        System.out.println("등록할 메뉴 입력");
        String menuName= sc.nextLine();
        System.out.println("메뉴의 가격입력");
        int menuprice= sc.nextInt();
        sc.nextLine();
        System.out.println("판매여부 Y/N");
        String orderablaStatus= sc.nextLine();

        MenuandCategoryDTO menuandCategoryDTO=new MenuandCategoryDTO();
        CategoryDTO categoryDTO=new CategoryDTO();

        categoryDTO.setName(categoryName);
        menuandCategoryDTO.setCategory(categoryDTO);
        menuandCategoryDTO.setPrice(menuprice);
        menuandCategoryDTO.setName(menuName);
        menuandCategoryDTO.setOrderableStatus(orderablaStatus);

        return menuandCategoryDTO;
    }

    private static void resultMapSubMenu() {
        Scanner sc=new Scanner(System.in);
        ElementTestService elementTestService=new ElementTestService();
        do {
            System.out.println("=====<resultMap> 서브메뉴");
            System.out.println("1.<resultMap>테스트");
            System.out.println("2.<constructor> 테스트");
            System.out.println("3.<association> 테스트");
            System.out.println("4.<Collection> 테스트");
            System.out.println("메뉴번호입력");
            int no= sc.nextInt();
            switch (no){
                case 1:elementTestService.selectResultMapTest();break;
                case 2:elementTestService.selectResultMapConstructorTest();break;
                case 3:elementTestService.selectResultMapAssociationTest();break;
                case 4:elementTestService.selectResultMapCollectionTest();break;
            }
        }while (true);
    }
}
