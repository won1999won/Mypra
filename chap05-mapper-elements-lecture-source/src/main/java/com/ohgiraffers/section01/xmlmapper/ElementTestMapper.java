package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.CategoryAndMenuDTO;
import com.ohgiraffers.common.MenuDTO;
import com.ohgiraffers.common.MenuandCategoryDTO;

import java.util.List;

public interface ElementTestMapper {
    List<String> selectCacheTest();

    List<MenuDTO> selectResultMapTest();

    List<MenuDTO> selectResultMapConstructorTest();

    List<MenuandCategoryDTO> selectResultMapAssociationTest();

    List<CategoryAndMenuDTO> selectResultMapCollectionTest();

    List<MenuDTO> selectSqlTest();

    int insertNewCategory(MenuandCategoryDTO menuandCategory);

    int insertNewMenu(MenuandCategoryDTO menuandCategory);
}
