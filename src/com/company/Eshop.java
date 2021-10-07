package com.company;

import java.util.ArrayList;

public class Eshop {
    private String name;
    private int profit;
    private ArrayList<Product> arr = new ArrayList<Product>();

    public Eshop(String name) {
        this.name = name;
        this.profit = 0;
    }

    public void addToTheStock(Product a) {
        arr.add(a);
    }

    public int sumOfProducts(int a, int b) {
        return a + b;
    }

    public int setProfit(int a) {
        int b = 0;
        return a + b;
    }

    public int getProfit() {
        return profit;
    }

    public int sellProduct(Product a) {
        if (arr.contains(a)) {
            arr.remove(a);
            return setProfit(a.getPrice());
        }
        return -1;
    }

    public String after() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

   public String toString(Product a, Product b) {
        return  a.getNameOfProduct() + " " + a.getPrice() + " " + a.getDescription()
                + ", " + b.getNameOfProduct() + " " + b.getPrice() + " " + b.getDescription();
    }
}
