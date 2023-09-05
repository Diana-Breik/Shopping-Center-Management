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
    public void addOrder(int key,Order order){
        ordersMap.put(key,order);
    }


    //Methode zum Entfernen von Bestellungen
    public void deleteOrder(int key){
        ordersMap.remove(key);
    }

    // Methode zum Abfragen von Bestellungen// return true wenn der Order noch da ist
    public boolean isOrderStillInOrders(int key){
        return ordersMap.containsKey(key);
    }



}
