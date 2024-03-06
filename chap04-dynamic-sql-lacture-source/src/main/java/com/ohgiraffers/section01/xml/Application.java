package com.ohgiraffers.section01.xml;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("동적 sql");
            System.out.println("1.if");
            System.out.println("2.choose(when,otherwise)");
            System.out.println("3.foreach");
            System.out.println("4.trim(where,set)");
            System.out.println("9.종료");
            int no= sc.nextInt();

            switch (no){
                case 1: ifSubMenu();break;
                case 2:chooseSubMenu();break;
                case 3:foreachSubMenu();break;
                case 4:trimSubMenu();break;
                case 9: System.out.println("종료");return;
            }
        }while (true);

    }

    private static void foreachSubMenu() {
        Scanner sc=new Scanner(System.in);
        MenuService menuService=new MenuService();
        do {
            System.out.println("foreach 서브매뉴");
            System.out.println("1.랜덤 메뉴 5개 조회");
            System.out.println("9.이전메뉴");
            System.out.println("번호 입력");
            int no= sc.nextInt();

            switch (no){
                case 1:menuService.selectMenuByRandumMenuCode(createRandomMenuCodeList());break;
                case 9:return;
            }
        }while (true);
    }

    private static List<Integer> createRandomMenuCodeList() {

        Set<Integer> set = new HashSet<>(); //set은 순서가 없으며 중복을 허용안함
        while (set.size() < 5){
            int temp=((int)(Math.random() * 26)) + 1;
            set.add(temp);
        }
        List<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        return list;

    }private  static  void  trimSubMenu(){
        Scanner sc=new Scanner(System.in);
        MenuService menuService=new MenuService();

        do {
            System.out.println("trim 서브매뉴");
            System.out.println("1.검색조건이있는경우 메뉴코드로 조회 없으면 전체조회");
            System.out.println("2.메뉴명 혹은 카테고리 코드로 검색 단 둘다 일치하는경우도 검색 조건이 없는경우 전체검색");
            System.out.println("3.원하는 메뉴정보만 수정");
            System.out.println("9.이전메뉴");
            System.out.println("번호 입력");
            int no= sc.nextInt();

            switch (no){
                case 1:menuService.searchMenuByCodeOrSearchAll(inputAllOrOne());break;
                case 2:menuService.searchMenuByNameOrCategory(inputSearchCriteriaMap());break;
                case 3:menuService.modifyMenu(inputChageInfo()); break;
                case 9:return;
            }
        }while (true);

    }

    private static void chooseSubMenu() {
        Scanner scanner=new Scanner(System.in);
        MenuService menuService=new MenuService();
        do {
            System.out.println("choose 서브메뉴");
            System.out.println("카테고리 상위 분류별 보여주기(식사,음료,디저트)");
            System.out.println("이전메뉴로");
            System.out.print("입력:");
            int no= scanner.nextInt();
            switch (no){
                case 1:menuService.searchMenuBySupCategory(inputSupCategory());
                case 9:return;
            }
        }while (true);
    }

    private  static  SearchCriteria inputSupCategory(){
        Scanner sc=new Scanner(System.in);
        System.out.println("상위분류 입력(식사,음료,디저트)");
        String value= sc.nextLine();
        return  new SearchCriteria("category",value);
    }

    public static void ifSubMenu(){
        Scanner sc=new Scanner(System.in);
        MenuService menuService=new MenuService();
        do {
            System.out.println("if 서브 메뉴");
            System.out.println("1.금액대 추천목록 출력");
            System.out.println("2.메뉴이름,카테고리명으로 검색해서 목록 출력");
            System.out.println("9.이전");
            int no= sc.nextInt();
            switch (no){
                case 1:menuService.selectMenuByPrice(inputPrice());break;
                case 2:menuService.searchMenu(inputSearchCriteria());
                case 9:return;
            }
        }while (true);
    }
    private static int inputPrice(){
        Scanner sc=new Scanner(System.in);
        System.out.println("희망 최대가격 입력");
        int price= sc.nextInt();

        return price;

    }

    private static SearchCriteria inputSearchCriteria(){
        Scanner sc=new Scanner(System.in);
        System.out.println("이름또는 카테고리 입력");
        String condition= sc.nextLine();
        System.out.println("검색어 입력");
        String value= sc.nextLine();

        return new SearchCriteria(condition,value);
    }
    private static SearchCriteria inputAllOrOne(){
        Scanner sc=new Scanner(System.in);
        System.out.println("검색조건입력? 예/아니요");
        boolean hasSearchValue="예".equals(sc.nextLine());

        SearchCriteria searchCriteria= new SearchCriteria();
        if (hasSearchValue){
            System.out.println("메뉴코드입력");
            String code= sc.nextLine();
            searchCriteria.setCondition("menuCode");
            searchCriteria.setValue(code);
        }
        return searchCriteria;
    }
    private static Map<String,Object> inputSearchCriteriaMap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("검색조건입력? 이름/카테고리/둘다/없음");

        String condiditon= sc.nextLine();
        Map<String,Object> criteria=new HashMap<>();
        if ("category".equals(condiditon)){
            System.out.println("검색할 카테고리:");
            String categoryValue= sc.nextLine();
            criteria.put("categoryValue",categoryValue);

        }else if ("name".equals(condiditon)){
            System.out.println("이름을 입력");
            String nameValue= sc.nextLine();
            criteria.put("nameValue",nameValue);

        }else if ("both".equals(condiditon)){
            System.out.println("검색할 이름:");
            String nameValue= sc.nextLine();
            System.out.println("검색할 카테고리");
            String categoryValue= sc.nextLine();
            criteria.put("nameValue",nameValue);
            criteria.put("categoryValue",categoryValue);
        }

        return criteria;
    }


    private static Map<String,Object> inputChageInfo() {
        Scanner sc=new Scanner(System.in);
        System.out.println("변경할 메뉴코드 입력");
        int code= sc.nextInt();
        System.out.println("변경할 메뉴이름 입력");
        sc.nextLine();
        String name= sc.nextLine();
        System.out.println("변경할 카테고리 코드 입력");
        int categoryCode= sc.nextInt();
        System.out.println("판매여부 Y/N");
        sc.nextLine();
        String orderableStatus= sc.nextLine();

        Map<String,Object> critaria=new HashMap<>();
        critaria.put("code",code);
        critaria.put("name",name);
        critaria.put("categoryCode",categoryCode);
        critaria.put("oderableStatus",orderableStatus);

        return critaria;
    }
}

