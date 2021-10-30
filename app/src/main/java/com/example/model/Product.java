package com.example.model;

public class Product{
    private int productThumb;
    private String productName;
    private double productPrice;
    private String productSlogan;

    public Product(int productThumb, String productName, double productPrice, String productSlogan) {
        this.productThumb = productThumb;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productSlogan = productSlogan;
    }

    public int getProductThumb() {
        return productThumb;
    }

    public void setProductThumb(int productThumb) {
        this.productThumb = productThumb;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductSlogan() {
        return productSlogan;
    }

    public void setProductSlogan(String productSlogan) {
        this.productSlogan = productSlogan;
    }
}
