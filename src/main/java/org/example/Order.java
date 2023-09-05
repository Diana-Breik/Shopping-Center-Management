package org.example;

import java.util.List;

//Schritt 1: Erstelle einen Record Order mit den benötigten Attributen.
public record Order( int ordernumber, List<Product> myOrder) {


}
