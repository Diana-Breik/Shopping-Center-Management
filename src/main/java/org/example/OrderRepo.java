package org.example;

//Schritt 1: Erstelle ein OrderRepo-Interface mit den Methoden aus dem OrderListRepo (Hinzufügen, Entfernen und Abfragen von Bestellungen)
public interface OrderRepo {
    public void addOrder(int key, Order order);
    public void deleteOrder(int key);
    public boolean isOrderStillInOrders(int key);
}
