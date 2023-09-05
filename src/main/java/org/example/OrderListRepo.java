package org.example;

import java.util.ArrayList;
import java.util.List;

//Schritt 2: Implementiere die OrderListRepo-Klasse mit einer Liste zur Speicherung von Bestellunge

public class OrderListRepo implements OrderRepo{
    private List<Order> orders = new ArrayList<>();

    //Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.
    //Methode zum Hinzufügen von Bestellungen
    public void addOrder(Order order){
        orders.add(order);
    }

    //Methode zum Entfernen von Bestellungen
    public void deleteOrder(Order order){
        orders.remove(order);
    }

    // Methode zum Abfragen von Bestellungen// return true wenn der Order noch da ist
    public boolean isOrderStillInOrders(Order order){
        return orders.contains(order);
    }

    @Override
    public String toString() {
        return "OrderListRepo{" +
                "orders=" + orders +
                '}';
    }
}
