package com.management.product.model.dto;

public class ProductDTO {

    private String productCode;
    private String productName;
    private String originCost;
    private String releaseDate;
    private String discountRate;
    private String salesQuantity;
    private String stockQuantity;
    private String categoryCode;
    private String production;

    public ProductDTO() {
    }

    public ProductDTO(String productCode, String productName, String originCost, String releaseDate, String discountRate, String salesQuantity, String stockQuantity, String categoryCode, String production) {
        this.productCode = productCode;
        this.productName = productName;
        this.originCost = originCost;
        this.releaseDate = releaseDate;
        this.discountRate = discountRate;
        this.salesQuantity = salesQuantity;
        this.stockQuantity = stockQuantity;
        this.categoryCode = categoryCode;
        this.production = production;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOriginCost() {
        return originCost;
    }

    public void setOriginCost(String originCost) {
        this.originCost = originCost;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public String getSalesQuantity() {
        return salesQuantity;
    }

    public void setSalesQuantity(String salesQuantity) {
        this.salesQuantity = salesQuantity;
    }

    public String getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(String stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", originCost='" + originCost + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", discountRate='" + discountRate + '\'' +
                ", salesQuantity='" + salesQuantity + '\'' +
                ", stockQuantity='" + stockQuantity + '\'' +
                ", categoryCode='" + categoryCode + '\'' +
                ", production='" + production + '\'' +
                '}';
    }
    // * 주석을 지우고 제품 정보를 담는 객체를 만들 java class를 작성하세요.
    // * 모든 필드는 String 타입으로 작성하시고, ProductDTO productCompany DB의 'PRODUCT_INFO' 테이블과 매핑 가능해야 합니다.
    // * DTO 객체에 대하여 기본적으로 작성해야 하는 사항 5가지 항목을 반드시 작성하세요.

}
