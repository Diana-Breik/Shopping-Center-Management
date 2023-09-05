package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderListRepo orderListRepo = new OrderListRepo();
        ProductRepo productRepo = new ProductRepo();
        Product product1 = new Product("T-Schirt",12);
        Product product2 = new Product("Tasse",341);
        Product product3 = new Product("Stift",555);
        productRepo.addProduct(product1);
        productRepo.addProduct(product2);
        productRepo.addProduct(product3);

        //alle Produkte,die im Shop sind, ausgeben.
        System.out.println("The products in store are: ");
        System.out.println(productRepo);
        System.out.println("-------------");

        //ein Produkt entfernen oder nach einem abfragen
        productRepo.deleteProduct(product3);
        //System.out.println(productRepo);

        System.out.println("Are there in store mugs? if yes print true");
        System.out.println(productRepo.isProductInStore(product2));
        System.out.println("-------------");

        //Bestellung aufgeben
        ShopService shopService = new ShopService(orderListRepo,productRepo);
        Order order1= new Order(List.of(product2, new Product("Handy",13),product3));
        shopService.createAnOrder(order1);
        System.out.println("-------------");
        System.out.println("My Shop: ");
        System.out.println(shopService);
        System.out.println("-------------");


        

    }
}