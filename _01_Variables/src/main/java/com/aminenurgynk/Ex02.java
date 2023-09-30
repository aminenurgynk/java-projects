package com.aminenurgynk;

/*
Q1-) We know that a product's price includes 18% Tax and a 15% profit margin.
Let's assume we have the price of this product.
Then, we'll calculate the product's net price without Tax and the base price.
 */
public class Ex02 {
    public static void main(String[] args) {
        int price = 100;
        float basePrice, netPrice;

        netPrice = price / 1.18f;
        basePrice = netPrice / 1.15f;

        System.out.println("Net price (without tax) : " + netPrice);
        System.out.println("Base price of product : " + basePrice);
    }
}
