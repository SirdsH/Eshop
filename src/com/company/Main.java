package com.company;


public class Main {

    public static void main(String[] args) {


        Product GalaxyS7 = new Product("GalaxyS7", "Its phone", 15000);
        Product Galaxy7 = new Product("Galaxy7", "Its phone", 9000);
        Eshop ep = new Eshop("Alza");

        ep.addToTheStock(GalaxyS7);
        ep.addToTheStock(Galaxy7);
        System.out.println("Our profit: " + ep.getProfit());
        System.out.println("Our stock: " + ep.toString(GalaxyS7, Galaxy7));
        System.out.println("Our sum of stock: " + ep.sumOfProducts(GalaxyS7.getPrice(), Galaxy7.getPrice()));
        System.out.println("Our profit after: " + ep.sellProduct(GalaxyS7));    
    }
}
