package com.management.product.view;

import com.common.SearchCondition;
import com.management.product.model.dao.ProductDAO;
import com.management.product.model.dto.ProductDTO;

import java.util.List;

public class ProductPrint {

    // * 모든 출력은 System.out.println()을 통해 콘솔에 출력하는 것을 의미합니다.
    // 주석을 지우고 다음 네 가지 메소드를 작성하세요.


    public void printAllProductList(List<ProductDTO> allProductList) {

        for (ProductDTO alllist : allProductList) {
            System.out.println(alllist);
        }
        // 1. 전체 조회한 목록 출력하는 메소드
        //    (조건) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.

    }

    public void printProductList(List<ProductDTO> productList, SearchCondition searchCondition) {

        System.out.println("검색조건:" + searchCondition);
        if (productList.isEmpty()) {
            System.out.println("데이터없음");
        } else {
            System.out.println(productList);
        }
        // 2. 조건에 따라 조회한 목록을 출력하는 메소드
        //    (조건 1) SearchCondition 객체로 검색 조건이 무엇인지 출력하세요.
        //    (조건 2) List<ProductDTO>로 받아온 데이터 목록을 전체 출력하세요.

    }

    public void printSuccessMessage(String successCode) {
        switch (successCode) {
            case "update":
                System.out.println("업데이트 성공");
            case "delete":
                System.out.println("삭제 성공");
            default:
                System.out.println("값오류");
        }

        // 3. 성공메시지를 출력하는 메소드
        //    (조건) 성공코드를 전달받아 성공을 알리는 메시지를 출력하세요.

    }

    public void printErrorMessage(String errorCode) {

        switch (errorCode) {
            case "update":
                System.out.println("업데이트 실패");
            case "delete":
                System.out.println("삭제 실패");
            default:
                System.out.println("값오류");


                // 4. 에러메시지를 출력하는 메소드
                //    (조건) 에러코드를 전달받아 에러를 알리는 메시지를 출력하세요.

        }

    }
}
