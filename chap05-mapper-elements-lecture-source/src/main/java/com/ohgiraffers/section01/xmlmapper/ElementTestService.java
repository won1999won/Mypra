package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.*;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ElementTestService {

    private ElementTestMapper mapper;
    public void selectCacheTest() {

        SqlSession sqlSession = Template.getSqlSession();
        mapper = sqlSession.getMapper(ElementTestMapper.class);

        /* 최초 요청 시에는 시간이 걸리지만 그 이후에는 캐싱된 데이터를 불러오기 때문에 속도가 빠르다. */
        for(int i = 0; i < 10; i++) {

            Long startTime = System.currentTimeMillis();

            List<String> nameList = mapper.selectCacheTest();
            System.out.println(nameList);

            Long endTime = System.currentTimeMillis();

            Long interval = endTime - startTime;
            System.out.println("수행시간 : " + interval + "(ms)");

        }
        sqlSession.close();
    }

    public void selectResultMapTest() {
        SqlSession sqlSession=Template.getSqlSession();
        mapper=sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuDTOList = mapper.selectResultMapTest();
        for (MenuDTO menu:menuDTOList){
            System.out.println(menu);
        }sqlSession.close();
    }

    public void selectResultMapConstructorTest() {
        SqlSession sqlSession=Template.getSqlSession();
        mapper=sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> menuDTOList = mapper.selectResultMapConstructorTest();
        for (MenuDTO menu:menuDTOList){
            System.out.println(menu);
        }sqlSession.close();


    }

    public void selectResultMapAssociationTest() {
        SqlSession sqlSession=Template.getSqlSession();
        mapper=sqlSession.getMapper(ElementTestMapper.class);

        List<MenuandCategoryDTO> menuDTOList = mapper.selectResultMapAssociationTest();
        for (MenuandCategoryDTO menu:menuDTOList){
            System.out.println(menu);
        }sqlSession.close();

    }

    public void selectResultMapCollectionTest() {
        SqlSession sqlSession=Template.getSqlSession();
        mapper=sqlSession.getMapper(ElementTestMapper.class);
        List<CategoryAndMenuDTO> categoryList=mapper.selectResultMapCollectionTest();

        for (CategoryAndMenuDTO categoryAndMenuDTO:categoryList){
            System.out.println(categoryAndMenuDTO);
        }sqlSession.close();

    }

    public void selectSqlTest() {
        SqlSession sqlSession=Template.getSqlSession();
        mapper=sqlSession.getMapper(ElementTestMapper.class);

        List<MenuDTO> categoryList=mapper.selectSqlTest();
        for (MenuDTO menu:categoryList){
            System.out.println(menu);
        }sqlSession.close();


    }

    public void insertCategoryAndMenuTest(MenuandCategoryDTO menuandCategory) {
        SqlSession sqlSession=Template.getSqlSession();
        mapper=sqlSession.getMapper(ElementTestMapper.class);

        int result1=mapper.insertNewCategory(menuandCategory);
        int result2=mapper.insertNewMenu(menuandCategory);

        if (result1>0&&result2>0){
            System.out.println("카테고리및 메뉴 등록성공");
            sqlSession.commit();
        }else {
            System.out.println("등록실패");
            sqlSession.rollback();
        }sqlSession.close();
    }
}
