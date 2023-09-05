package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Erstelle eine Klasse OrderMapRepo, über die wir neue Bestellungen aufgeben können.
public class OrderMapRepo implements OrderRepo{
    private Map<Integer,Order> ordersMap = new HashMap<>();

    //Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Bestellungen.
    //Methode zum Hinzufügen von Bestellungen
    public void addOrder(Order order){
        ordersMap.put(order.ordernumber(),order);
    }


    //Methode zum Entfernen von Bestellungen
    public void deleteOrder(Order order){
        ordersMap.remove(order.ordernumber());
    }

    // Methode zum Abfragen von Bestellungen// return true wenn der Order noch da ist
    public boolean isOrderStillInOrders(Order order){
        return ordersMap.containsKey(order.ordernumber());
    }

    @Override
    public String toString() {
        return "OrderMapRepo{" +
                "ordersMap=" + ordersMap +
                '}';
    }
}
