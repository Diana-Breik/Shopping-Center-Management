package org.example;

//Schritt 1: Erstelle ein OrderRepo-Interface mit den Methoden aus dem OrderListRepo (Hinzufügen, Entfernen und Abfragen von Bestellungen)
public interface OrderRepo {
    public void addOrder(Order order);
    public void deleteOrder(Order order);
    public boolean isOrderStillInOrders(Order order);
}
