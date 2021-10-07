package com.company;

public class Product {
    private String nameOfProduct;
    private String description;
    private int price;

    public Product(String name, String description, int price) {
        this.nameOfProduct = name;
        this.description = description;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}
