package org.example;

import java.util.ArrayList;
import java.util.List;

//Erstelle eine Klasse ShopService, über die wir neue Bestellungen aufgeben können.
public class ShopService {

    OrderListRepo orderListRepo = new OrderListRepo();
    ProductRepo productRepo = new ProductRepo();

    public ShopService(OrderListRepo orderListRepo, ProductRepo productRepo) {
        this.orderListRepo = orderListRepo;
        this.productRepo = productRepo;
    }

    //Schritt 1: Implementiere eine Methode, um eine neue Bestellung aufzugeben
    //Schritt 2: Überprüfe, ob die bestellten Produkte existieren. Wenn nicht gebe ein System.out.println aus.
    public void createAnOrder(Order order){
        List<Product> newlist = new ArrayList<>();
        System.out.println("The Order that was requested is: " + order);// was der Kunde kaufen wollte
         for (Product p: order.myOrder()){
             if( !productRepo.isProductInStore(p)){
                System.out.println("This Product (" + p.name() +") does not exist");

             }
             else {
                 newlist.add(p);
                 continue;
             }
         }
        Order order2 = new Order(newlist);
        orderListRepo.addOrder(order2);
        System.out.println("The Order after confirmation is: " + order2);//was wirklich in dem Store, kann der kunde kaufen
    }

    @Override
    public String toString() {
        return "ShopService{" +
                "orderListRepo=" + orderListRepo +
                ", productRepo=" + productRepo +
                '}';
    }
}
