package com.management.product.model.dto;

public class ProductDTO {

    private String PRODUCT_CODE;
    private String PRODUCT_NAME;
    private String ORIGIN_COST;
    private String RELEASE_DATE;
    private String DISCOUNT_RATE;
    private String SALES_QUANTITY;
    private String STOCK_QUANTITY;
    private String CATEGORY_CODE;
    private String PRODUCTION_STATUS;

    public ProductDTO() {
    }

    public ProductDTO(String PRODUCT_CODE, String PRODUCT_NAME, String ORIGIN_COST, String RELEASE_DATE, String DISCOUNT_RATE, String SALES_QUANTITY, String STOCK_QUANTITY, String CATEGORY_CODE, String PRODUCTION_STATUS) {
        this.PRODUCT_CODE = PRODUCT_CODE;
        this.PRODUCT_NAME = PRODUCT_NAME;
        this.ORIGIN_COST = ORIGIN_COST;
        this.RELEASE_DATE = RELEASE_DATE;
        this.DISCOUNT_RATE = DISCOUNT_RATE;
        this.SALES_QUANTITY = SALES_QUANTITY;
        this.STOCK_QUANTITY = STOCK_QUANTITY;
        this.CATEGORY_CODE = CATEGORY_CODE;
        this.PRODUCTION_STATUS = PRODUCTION_STATUS;
    }

    public String getPRODUCT_CODE() {
        return PRODUCT_CODE;
    }

    public void setPRODUCT_CODE(String PRODUCT_CODE) {
        this.PRODUCT_CODE = PRODUCT_CODE;
    }

    public String getPRODUCT_NAME() {
        return PRODUCT_NAME;
    }

    public void setPRODUCT_NAME(String PRODUCT_NAME) {
        this.PRODUCT_NAME = PRODUCT_NAME;
    }

    public String getORIGIN_COST() {
        return ORIGIN_COST;
    }

    public void setORIGIN_COST(String ORIGIN_COST) {
        this.ORIGIN_COST = ORIGIN_COST;
    }

    public String getRELEASE_DATE() {
        return RELEASE_DATE;
    }

    public void setRELEASE_DATE(String RELEASE_DATE) {
        this.RELEASE_DATE = RELEASE_DATE;
    }

    public String getDISCOUNT_RATE() {
        return DISCOUNT_RATE;
    }

    public void setDISCOUNT_RATE(String DISCOUNT_RATE) {
        this.DISCOUNT_RATE = DISCOUNT_RATE;
    }

    public String getSALES_QUANTITY() {
        return SALES_QUANTITY;
    }

    public void setSALES_QUANTITY(String SALES_QUANTITY) {
        this.SALES_QUANTITY = SALES_QUANTITY;
    }

    public String getSTOCK_QUANTITY() {
        return STOCK_QUANTITY;
    }

    public void setSTOCK_QUANTITY(String STOCK_QUANTITY) {
        this.STOCK_QUANTITY = STOCK_QUANTITY;
    }

    public String getCATEGORY_CODE() {
        return CATEGORY_CODE;
    }

    public void setCATEGORY_CODE(String CATEGORY_CODE) {
        this.CATEGORY_CODE = CATEGORY_CODE;
    }

    public String getPRODUCTION_STATUS() {
        return PRODUCTION_STATUS;
    }

    public void setPRODUCTION_STATUS(String PRODUCTION_STATUS) {
        this.PRODUCTION_STATUS = PRODUCTION_STATUS;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "PRODUCT_CODE=" + PRODUCT_CODE +
                ", PRODUCT_NAME='" + PRODUCT_NAME + '\'' +
                ", ORIGIN_COST=" + ORIGIN_COST +
                ", RELEASE_DATE='" + RELEASE_DATE + '\'' +
                ", DISCOUNT_RATE=" + DISCOUNT_RATE +
                ", SALES_QUANTITY=" + SALES_QUANTITY +
                ", STOCK_QUANTITY=" + STOCK_QUANTITY +
                ", CATEGORY_CODE=" + CATEGORY_CODE +
                ", PRODUCTION_STATUS=" + PRODUCTION_STATUS +
                '}';
    }
    // * 주석을 지우고 제품 정보를 담는 객체를 만들 java class를 작성하세요.
    // * 모든 필드는 String 타입으로 작성하시고, ProductDTO productCompany DB의 'PRODUCT_INFO' 테이블과 매핑 가능해야 합니다.
    // * DTO 객체에 대하여 기본적으로 작성해야 하는 사항 5가지 항목을 반드시 작성하세요.

}
