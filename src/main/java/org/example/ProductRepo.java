package org.example;

import java.util.ArrayList;
import java.util.List;

//Coding-Aufgabe: ProductRepo
//Erstelle eine Klasse ProductRepo, die eine Liste von Product-Objekten enthält.
//
//Schritt 2: Implementiere die ProductRepo-Klasse mit einer Liste zur Speicherung von Produkten.
//
//Schritt 3: Implementiere Methoden zum Hinzufügen, Entfernen und Abfragen von Produkten.
public class ProductRepo {
    private List<Product> products = new ArrayList<>();

    //Methode zum Hinzufügen von Produkten
    public void addProduct(Product product){
        products.add(product);

    }
    //Methode zum Entfernen von Produkten
    public void deleteProduct(Product product){
        products.remove(product);

    }

    // Methode zum Abfragen von Produkten// return true wenn das Produkt da ist
    public boolean isProductInStore(Product product){
        return products.contains(product);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
